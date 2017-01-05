import java.util.*;
public class Nodes 
{
	public int[] optimal(int n, int[][] distance)
	{
        int result[]=new int[n+2];
	TreeSet<Integer> a=new TreeSet<>();
	for(int k=1;k<n;k++)
	a.add(k);
	int temp=0,i=1,sum=0,j,temp1=0,least,tempdist;
	result[0]=0;
	Iterator itr;
	while(a.size()!=1)
	{
		least=999999;
		itr=a.iterator();
		while(itr.hasNext())
		{
			j=(int)itr.next();
			tempdist=distance[temp][j];
			if(tempdist>0 && tempdist<least)
			{
				least=tempdist;
				temp1=j;
			}
		}
		result[i]=temp1;	
		i++;
		a.remove(temp1);
		temp=temp1;
		sum+=least;
	}
	itr=a.iterator();
	result[i]=(int)itr.next();
	sum+=distance[temp][result[i]]+distance[0][result[i]];
	i++;
	result[i]=0;
	i++;
	result[i]=sum;
	return result;
	}
}




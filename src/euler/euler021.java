package euler;

import java.util.ArrayList;

public class euler021 {
	public static int properdivisor(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
		
			if(n%i==0)
			{
				sum+=i;
			}

		}
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<10000;i++)
		{
			if(properdivisor(properdivisor(i))==i && properdivisor(i)!=i)
			{
				if(!list.contains(i))
				{
					list.add(i);
				}
			}
		}
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}

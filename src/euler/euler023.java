package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class euler023 {
//	public static boolean isAbundant(int n)
//	{
//		int sum=0;
//		for(int i=1;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				sum+=n;
//			}
//		}
//		if (sum>n)
//			return true;
//		return false;
//	}
//	
	public static void main(String[] args)
	{
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for(int i=2;i<=28123;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum>i)
				ab.add(i);
		}
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<ab.size();i++)
		{
			for(int j=i;j<ab.size();j++)
			{
				int sum=ab.get(i)+ab.get(j);
				if(sum<=28123)
				{
					res.add(sum);
				}
			}
		}
		Set<Integer> hs = new HashSet<>();
		hs.addAll(res);
		res.clear();
		res.addAll(hs);
		//System.out.println(res.size());
		int sum = res.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		int sum1=0;
		for(int k=1;k<=28123;k++)
		{
				sum1+=k;
				
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
//		for(int k=0;k<ab.size();k++)
//		{
//			System.out.println(ab.get(k));
//		}
	}
}

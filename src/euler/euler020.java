package euler;

import java.math.BigInteger;

public class euler020 {
//	public static int factorial(int n)
//	{
//		if(n==1)
//			return 1;
//		return n*factorial(n-1);
//	}
//	
//	public static int digitsum(int n)
//	{
//		int sum=0;
//		while(n>=10)
//		{
//			sum+=n%10;
//			n/=10;
//		}
//		sum+=n;
//		return sum;
//	}
	public static int digitsum(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum+=Integer.parseInt(s.substring(i, i+1));
		}
		return sum;
	}
	public static void main(String[] args)
	{
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=100;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		int sum=digitsum(fact.toString());
		System.out.println(sum);
	}

}

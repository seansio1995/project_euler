package euler;
import java.math.*;
public class euler010 {
	public static boolean isPrime(int n)
	{
		if(n==2)
		{
			return true;
		}
		if(n==3)
		{
			return true;
		}
		for(int i=2;i<=Math.sqrt((double)(n));i++)
				{
					if(n%i==0)
					{
						return false;
					}
				}
		return true;
	}
	public static void main(String[] args)
	{
		long sum=0;
		for(int i=2;i<2000000;i++)
		{
			if(isPrime(i))
			{
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}

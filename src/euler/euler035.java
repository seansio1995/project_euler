package euler;

public class euler035 {
	public static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean checkHundred(int n)
	{
		int a=(n%10)*100+n/10;
		int b=(n%100)*10+n/100;
		if(isPrime(a) && isPrime(b) && isPrime(n))
			return true;
		return false;
	}
	
	public static boolean checkThousand(int n)
	{
		int a=(n%10)*1000+n/10;
		int b=(n%100)*100+n/100;
		int c=(n%1000)*10+n/1000;
		if(isPrime(a) && isPrime(b) && isPrime(c) && isPrime(n))
			return true;
		return false;
	}
	
	public static boolean checkTenThousand(int n)
	{
		int a=(n%10)*10000+n/10;
		int b=(n%100)*1000+n/100;
		int c=(n%1000)*100+n/1000;
		int d=(n%10000)*10+n/10000;
		if(isPrime(a) && isPrime(b) && isPrime(c) && isPrime(d) && isPrime(n))
			return true;
		return false;
	}
	
	public static boolean checkHundredThousand(int n)
	{
		int a=(n%10)*100000+n/10;
		int b=(n%100)*10000+n/100;
		int c=(n%1000)*1000+n/1000;
		int d=(n%10000)*100+n/10000;
		int e=(n%100000)*10+n/100000;
		if(isPrime(a) && isPrime(b) && isPrime(c) && isPrime(d) && isPrime(e) && isPrime(n))
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		int count=0;
		//System.out.println(isPrime(4201));
		for(int i=100;i<=999;i++)
		{
			if(checkHundred(i))
			{
				count++;
			}
		}
		
		for(int i=1000;i<=9999;i++)
		{
			if(checkThousand(i))
			{
				count++;
			}
		}
		
		for(int i=10000;i<=99999;i++)
		{
			if(checkTenThousand(i))
			{
				count++;
			}
		}
		
		for(int i=100000;i<=999999;i++)
		{
			if(checkHundredThousand(i))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}

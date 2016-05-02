package euler;

public class euler012 {
	public static int countDivisor(int n)
	{
		int count=1;
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				count+=2;
			}
			
			if(n==i*i)
			{
				count--;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int n=1;
		int res=1;
		while(countDivisor(res)<500)
		{
			n++;
			res=n*(n+1)/2;
		}
		System.out.println(res);
	}
}

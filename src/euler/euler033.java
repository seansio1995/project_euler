package euler;

public class euler033 {
	public static int fact(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args)
	{
		int result=0;
		for(int i=3;i<=1000000;i++)
		{
			int sum=0;
			int digit=i;
			while(digit>0)
			{
				int tmp=fact(digit%10);
				sum+=tmp;
				digit/=10;
			}
			if(sum==i)
			{
				result+=i;
			}
		}
		
		System.out.println(result);
	}

}

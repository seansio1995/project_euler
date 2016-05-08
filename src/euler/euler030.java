package euler;
//this upper bound I found out from someone's ans which is not strict at all
public class euler030 {
	public static void main(String[] args)
	{
		int result=0;
		for(int i=2;i<=354294;i++)
		{
			int sum=0;
			int digit=i;
			while(digit>0)
			{
				int tmp=1;
				for(int j=0;j<5;j++)
				{
					tmp*=digit%10;
				}
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

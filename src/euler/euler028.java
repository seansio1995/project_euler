package euler;

public class euler028 {
	public static void main(String[] args)
	{
		int sum=1;
		for(int n=2;n<=501;n++)
		{
			sum+=2*(2*(2*n-1)*(2*n-1)-6*(n-1));
		}
		System.out.println(sum);
	}

}

package euler;

public class euler032 {
	public static void main(String[] args)
	{
		for(int a=1;a<=9;a++)
		{
			for(int b=1;b<=9;b++)
			{
				for(int c=1;c<=9;c++){
					if((10*a+b)*c==a*(10*b+c))
					{
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
					}
				}
			}
		}
	}
}

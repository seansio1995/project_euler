package euler;

import java.util.Scanner;

public class euler027 {
	public static boolean isPrime(double n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
//		Scanner k=new Scanner(System.in);
//		System.out.println("Enter a number:");
//		double num=k.nextDouble();
//		System.out.println(isPrime(num));
		//double n=0;
		double maxa=0,maxb=0;
		
		int maxCount=0;
		for(int a=-1000;a<1000;a++)
		{
			for(int b=-1000;b<1000;b++)
			{
				int n=0;
				while(isPrime(Math.abs(n*n+a*n+b)))
						{
							n++;
							//count++;
						}
				if(n>maxCount)
				{
					maxCount=n;
					maxa=a;
					maxb=b;
				}
			}
		}
		
		System.out.println("a is "+maxa);
		System.out.println("b is "+maxb);
		System.out.println("maxcount is "+maxCount);
		System.out.println("Product is "+maxa*maxb);
	}

}

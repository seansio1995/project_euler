package euler;

public class euler024 {
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args)
	{
		int num=1000000;
		int factor=9;
//		int fact9=fact(9);
//		int first=num/fact9;
//		System.out.println(first);
//		first=2;
//		num=num%fact9;
//		int fact8=fact(8);
//		int second=num/fact8;
//		num=num%fact
//		System.out.println(fact9);
		
		while(num>1)
		{
			int digit=num/fact(factor);
			System.out.println(digit);
			num=num%fact(factor);
			factor--;
		}
		System.out.println(num);
	}

}

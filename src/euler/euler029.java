package euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class euler029 {
	public static void main(String[] args)
	{
//		BigInteger a=new BigInteger("2");
//		BigInteger b=new BigInteger("2");
		BigInteger hundred=new BigInteger("100");
		ArrayList<BigInteger> arr=new ArrayList<BigInteger>();
		for (BigInteger a = BigInteger.valueOf(2);
	            a.compareTo(hundred) <= 0;
	            a = a.add(BigInteger.ONE)) {

			for (int b = 2;
		            b <= 100;
		            b ++)
			{
				if(!arr.contains(a.pow(b)))
				{
					arr.add(a.pow(b));
				}
			}
	    }
		System.out.println(arr.size());
	}

}

package euler;

import java.math.BigInteger;

public class euler016 {
	public static void main(String[] args)
	{
		BigInteger n0,n,divisor,res;
		n0=new BigInteger("2");
		n=n0.pow(1000);
		divisor=new BigInteger("10");
		//System.out.println(n);
		res=new BigInteger("0");
		while(n.compareTo(divisor)==0 || n.compareTo(divisor)==1)
		{
			res=res.add(n.mod(divisor));
			n=n.divide(divisor);
		}
		res=res.add(n);
		System.out.println(res);
	}


}
package euler;

public class euler014 {
	
	public static void main(String[] args)
	{
		long flag=1000000;
		long maxLength=0;
		long startingNum=0;
		long sequence;
		for(int i=2;i<flag;i++)
		{
			int length=1;
			sequence=i;
			while(sequence!=1)
			{
				if(sequence%2==0)
				{
					sequence=sequence/2;
				}
				else
				{
					sequence=3*sequence+1;
				}
				length++;
			}
			if(length>maxLength)
			{
				maxLength=length;
				startingNum=i;
			}
		}
		
		System.out.println("Max length is "+maxLength);
		System.out.println("Starting number is "+startingNum);
		
	}

}

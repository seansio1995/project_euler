package euler;

public class euler015 {
	public static void main(String[] args)
	{
		// n(40,20)
		int gridSize=20;
		long path=1;
		for(int i=0;i<gridSize;i++)
		{
			path=path*(2*gridSize-i)/(i+1);
		}
		
		System.out.println("Path is "+path);
	}
}

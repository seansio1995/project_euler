package euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class euler018 {
//	public static int[][] readInput(String filename) throws FileNotFoundException, IOException
//	{
//		String line;
//		String[] linepieces;
//		int lineCount=0;
//		int[][] triangle={};
////		try(BufferedReader r=new BufferedReader(new FileReader(filename)))
////		{
//		Scanner r=new Scanner(new File(filename));
//			while(r.hasNextLine())
//			{
//				lineCount++;
//			}
//			//triangle=new int[lineCount][lineCount];
//			int j=0;
//			while(r.hasNextLine())
//			{
//				linepieces=r.nextLine().split(" ");
//				for (int i = 0; i < linepieces.length; i++) {
//		            triangle[j][i] = Integer.parseInt(linepieces[i]);
//		        }
//				j++;
//			}
//			r.close();
//		//}
//		return triangle;
//		
//	}
//	
//	public static void main(String[] args) throws FileNotFoundException, IOException
//	{
//		int[][] triangle=readInput("triangle0.txt");
//		//System.out.println(triangle.length);
//		for(int j=0;j<15;j++)
//		{
//			for(int i=0;i<=j;i++)
//			{
//				System.out.print(triangle[j][i]);
//			}
//		}
	//}

	public static void main(String[] args)
	{
		int[][] triangle={
		                  {75},
		                  {95,64},
		                  {17,47,82},
		                  {18,35,87,10},
		                  {20,04,82,47,65},
		                  {19,01,23,75,03,34},
		                  {88,02,77,73,07,63,67},
		                  {99,65,04,28,06,16,70,92},
		                  {41,41,26,56,83,40,80,70,33},
		                  {41,48,72,33,47,32,37,16,94,29},
		                  {53,71,44,65,25,43,91,52,97,51,14},
		                  {70,11,33,28,77,73,17,78,39,68,17,57},
		                  {91,71,52,38,17,14,91,43,58,50,27,29,48},
		                  {63,66,04,68,89,53,67,30,73,16,69,87,40,31},
		                  {04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
		//System.out.println(02);
		for(int i=13;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				triangle[i][j]+=Math.max(triangle[i+1][j],triangle[i+1][j+1]);
			}
		}
		System.out.println(triangle[0][0]);
	}
}

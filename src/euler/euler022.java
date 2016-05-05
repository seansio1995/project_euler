package euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class euler022 {
	public static String readfile(String filename) throws IOException 
	{
		StringBuilder sb=new StringBuilder();
		BufferedReader reader=new BufferedReader(new FileReader(filename));
		String buffer=null;
		while((buffer=reader.readLine())!=null)
		{
			sb.append(buffer);
		}
		
		reader.close();
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException
	{
		String input=readfile("p022_names.txt");
		String[] names=input.replace("\"", "").split(",");
		Arrays.sort(names);
		int total=0;
		for(int i=0;i<names.length;i++)
		{
			int sum=0;
			for(char c :names[i].toCharArray())
			{
				sum+=c-'A'+1;
			}
			total+=sum*(i+1);
		}
		
		System.out.println(total);
	}

}

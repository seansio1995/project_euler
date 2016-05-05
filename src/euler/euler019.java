package euler;

import java.util.Calendar;
import java.util.Date;

public class euler019 {
	
//		public static int increment(int flag)
//		{
//			int increment=0;
//		switch(flag)
//		{
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//			increment= 4;
//			break;
//		case 5:
//		case 6:
//		case 7:
//			increment=5;
//			break;
//			}
//		return increment;
//		}
//	
//
//	public static void main(String[] args)
//	{
//		int count=0;
//		int flag=0;
////		count+=increment(4);
////		System.out.println(count);
//		for(int n=1901;n<=2000;n++)
//		{
//			int leap=(n-1-1900)/4;
//			int days=(n-1900-leap)*365+leap*366;
//			flag=days%7+1;
//			count+=increment(flag);
//		}
//		System.out.println(count);
//	}
public static void main(String[] args)
{
	int sundays=0;
	for(int year=1901;year<=2000;year++)
	{
		for(int month=1;month<=12;month++)
		{
			Calendar date = Calendar.getInstance();
		    date.set(Calendar.YEAR, year);
		    date.set(Calendar.MONTH, month);
		    date.set(Calendar.DAY_OF_MONTH, 1);
		    if(date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
		    {
		    	sundays++;
		    }
		}
	}
	
	System.out.println(sundays);
}
}

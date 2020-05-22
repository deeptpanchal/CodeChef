import java.util.*;

public class Main
{
	static boolean leap_year(int year) 
	{
		return year % 400 == 0 ? true : year % 100 == 0 ? false : year % 4 == 0 ? true : false;
	}

	static int solve(int year, int month, int date) 
	{
		if (month == 2) 
		{
			if (!leap_year(year)) 
			{
				return (28 + 31 - date) / 2 + 1;
			} 
			else 
			{
				return (29 - date) / 2 + 1;
			}
		} 
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
			return (30 + 31 - date) / 2 + 1;
		} 
		else 
		{
			return (31 - date) / 2 + 1;
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			int year = Integer.parseInt(str.substring(0, 4));
			int month = Integer.parseInt(str.substring(5, 7));
			int date = Integer.parseInt(str.substring(8));
			System.out.println(solve(year, month, date));
		}
		s.close();
	}
}

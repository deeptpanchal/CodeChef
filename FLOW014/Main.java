package FLOW014;

import java.util.*;

public class Main 
{
	public static boolean a(float n) 
	{
		if (n > 50)
			return true;
		return false;
	}

	public static boolean b(float n) 
	{
		if (n < 0.7)
			return true;
		return false;
	}

	public static boolean c(float n) 
	{
		if (n > 5600)
			return true;
		return false;
	}

	public static String ans(boolean a, boolean b, boolean c) 
	{
		if (a && b && c) 
		{
			return "10";
		}
		if (a && b && !c) 
		{
			return "9";
		}
		if (!a && b && c) 
		{
			return "8";
		}
		if (a && !b && c) 
		{
			return "7";
		}
		if (a || b || c) 
		{
			return "6";
		}
		return "5";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			boolean a = a(s.nextFloat());
			boolean b = b(s.nextFloat());
			boolean c = c(s.nextFloat());
			System.out.println(ans(a, b, c));
		}
		s.close();
	}
}
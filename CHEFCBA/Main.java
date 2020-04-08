import java.util.*;

public class Main 
{
	static boolean solve(int a, int b, int c, int d) 
	{
		if (a * b == c * d) 
		{
			return true;
		}
		if (a * c == b * d) 
		{
			return true;
		}
		if (a * d == b * c) 
		{
			return true;
		}
		return false;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println(solve(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()) ? "Possible" : "Impossible");
		s.close();
	}
}

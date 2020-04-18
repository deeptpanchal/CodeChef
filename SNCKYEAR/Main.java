import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		if (n == 2010 || n == 2015 || n == 2016 || n == 2017 || n == 2019) 
		{
			return "HOSTED";
		}
		return "NOT HOSTED";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}

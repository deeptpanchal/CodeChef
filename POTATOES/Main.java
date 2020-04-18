import java.util.*;

public class Main 
{
	static boolean prime(int n) 
	{
		for (int i = 2; i <= Math.sqrt(n); i++) 
		{
			if (n % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	static int solve(int n) 
	{
		while (!prime(++n)) 
		{

		}
		return n;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(solve(x + y) - x - y);
		}
		s.close();
	}
}

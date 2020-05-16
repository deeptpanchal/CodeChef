import java.util.*;

public class Main 
{
	static int gcd(int a, int b) 
	{
		return b == 0 ? a : gcd(b, a % b);
	}

	static int solve(int x, int y) 
	{
		return 2 * gcd(x, y);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(solve(x, y));
		}
		s.close();
	}
}

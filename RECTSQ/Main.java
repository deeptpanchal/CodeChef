import java.util.*;

public class Main 
{
	static int gcd(int a, int b) 
	{
		if (b == 0) 
		{
			return a;
		}
		return gcd(b, a % b);
	}

	static int solve(int n, int m) 
	{
		int gcd = gcd(n, m);
		return n / gcd * m / gcd;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println(solve(n, m));
		}
		s.close();
	}
}

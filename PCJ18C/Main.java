import java.util.*;

public class Main 
{
	static long gcd(long a, long b) 
	{
		if (b == 0) 
		{
			return a;
		}
		return gcd(b, a % b);
	}

	static long[] solve(int n, int a, int k) 
	{
		long x = a * n * (n - 2 * k + 1) + 360 * (k - 1) * (n - 2);
		long y = n * (n - 1);
		long gcd = gcd(x, y);
		return new long[] { x / gcd, y / gcd };
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int a = s.nextInt();
			int k = s.nextInt();
			long ans[] = solve(n, a, k);
			System.out.println(ans[0] + " " + ans[1]);
		}
		s.close();
	}
}

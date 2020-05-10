import java.util.*;

public class Main 
{
	static int gcd(int a, int b) 
	{
		return b == 0 ? a : gcd(b, a % b);
	}

	static long lcm(int a, int b) 
	{
		return (long) a / gcd(a, b) * b;
	}

	static String solve(long n, int a, int b, long k) 
	{
		return n / a + n / b - n / lcm(a, b) * 2 >= k ? "Win" : "Lose";
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n = s.nextLong();
			int a = s.nextInt();
			int b = s.nextInt();
			long k = s.nextLong();
			System.out.println(solve(n, a, b, k));
		}
		s.close();
	}
}

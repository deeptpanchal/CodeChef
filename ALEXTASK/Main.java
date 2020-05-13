import java.util.*;

public class Main 
{
	static int gcd(int a, int b)
	{
		return b == 0 ? a : gcd(b, a % b);
	}

	static long lcm(int a, int b) 
	{
		return (long)a * b / gcd(a, b);
	}

	static long solve(int a[], int n) 
	{
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++) 
			{
				min = Math.min(min, lcm(a[i], a[j]));
			}
		}
		return min;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n));
		}
		s.close();
	}
}

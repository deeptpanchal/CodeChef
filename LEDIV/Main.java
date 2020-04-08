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

	static int solve(int a[]) 
	{
		int g = a[0];
		for (int i = 1; i < a.length; i++) 
		{
			g = gcd(g, a[i]);
		}
		if (g == 1) 
		{
			return -1;
		}
		for (int i = 2; i * i <= g; i++) 
		{
			if (g % i == 0) 
			{
				return i;
			}
		}
		return g;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}

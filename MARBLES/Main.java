import java.util.*;

public class Main 
{
	static long solve(long n, long k) 
	{
		long ans = 1;
		if (k > n / 2) 
		{
			k = n - k;
		}
		for (int i = 1; i <= k; i++) 
		{
			ans = ans * (n - i + 1) / i;
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n = s.nextLong();
			long k = s.nextLong();
			System.out.println(solve(n - 1, n - k));
		}
		s.close();
	}
}

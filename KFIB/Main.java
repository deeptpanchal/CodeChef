import java.util.*;

public class Main 
{
	static long solve(int n, int k) 
	{
		if (n <= k) 
		{
			return 1;
		}
		long a[] = new long[n];
		Arrays.fill(a, 0, k, 1);
		a[k] = k;
		for (int i = k + 1; i < n; i++) 
		{
			a[i] = (2 * a[i - 1] - a[i - 1 - k]) % 1000000007;
		}
		return a[n - 1];
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.println(solve(n, k));
		s.close();
	}
}

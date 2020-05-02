import java.util.*;

public class Main 
{
	static int solve(int a[], int n, int k, int v) 
	{
		int sum = 0;
		for (int i = 0; i < n; i++) 
		{
			sum = sum + a[i];
		}
		sum = v * (n + k) - sum;
		if (sum > 0 && sum % k == 0) 
		{
			return sum / k;
		}
		return -1;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int v = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n, k, v));
		}
		s.close();
	}
}

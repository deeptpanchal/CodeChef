import java.util.*;

public class Main
{
	static int solve(int a[], int d[], int n) 
	{
		int ans = -1;
		ans = d[0] > a[n - 1] + a[1] ? Math.max(ans, d[0]) : ans;
		for (int i = 1; i < n - 1; i++) 
		{
			ans = d[i] > a[i - 1] + a[i + 1] ? Math.max(ans, d[i]) : ans;
		}
		ans = d[n - 1] > a[n - 2] + a[0] ? Math.max(ans, d[n - 1]) : ans;
		return ans;
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
			int d[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				d[i] = s.nextInt();
			}
			System.out.println(solve(a, d, n));
		}
		s.close();
	}
}

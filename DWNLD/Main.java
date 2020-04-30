import java.util.*;

public class Main
{
	static int solve(int t[], int d[], int n, int k) 
	{
		int ans = 0;
		for (int i = 0; i < n; i++) 
		{
			if (k >= t[i]) 
			{
				k = k - t[i];
			} 
			else 
			{
				ans = ans + d[i] * (t[i] - k);
				k = 0;
			}
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int t[] = new int[n];
			int d[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				t[i] = s.nextInt();
				d[i] = s.nextInt();
			}
			System.out.println(solve(t, d, n, k));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static long solve(int n, int m, int[] p, int[] c, int[][] v) 
	{
		long ans = 0;
		for (int i = 0; i < m; i++) 
		{
			if (c[p[i]] > 0) 
			{
				ans += v[p[i]][c[p[i]]-- - 1];
			}
		}
		return ans;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int p[] = new int[m];
			for (int i = 0; i < m; i++) 
			{
				p[i] = s.nextInt();
			}
			int c[] = new int[n];
			int v[][] = new int[n][];
			for (int i = 0; i < n; i++) 
			{
				c[i] = s.nextInt();
				v[i] = new int[c[i]];
				for (int j = 0; j < c[i]; j++) 
				{
					v[i][j] = s.nextInt();
				}
				Arrays.sort(v[i]);
			}
			System.out.println(solve(n, m, p, c, v));
		}
		s.close();
	}
}

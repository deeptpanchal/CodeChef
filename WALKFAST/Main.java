import java.util.*;

public class Main 
{
	static int time(int x[], int t, int start, int end) 
	{
		return t * Math.abs(x[end - 1] - x[start - 1]);
	}

	static int solve(int n, int a, int b, int c, int d, int p, int q, int y, int x[]) 
	{
		int walk_time = time(x, p, a, b);
		if (time(x, p, a, c) <= y) 
		{
			int train_time = y + time(x, q, c, d) + time(x, p, d, b);
			return Math.min(walk_time, train_time);
		}
		return walk_time;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0)
		{
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			int p = s.nextInt();
			int q = s.nextInt();
			int y = s.nextInt();
			int x[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				x[i] = s.nextInt();
			}
			System.out.println(solve(n, a, b, c, d, p, q, y, x));
		}
		s.close();
	}
}

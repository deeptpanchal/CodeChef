import java.util.*;

public class Main 
{
	static long solve(int n, int a, int b, int c, int f[]) 
	{
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) 
		{
			min = Math.min(min, (long) Math.abs(a - f[i]) + Math.abs(b - f[i]) + c);
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
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int f[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				f[i] = s.nextInt();
			}
			System.out.println(solve(n, a, b, c, f));
		}
		s.close();
	}
}

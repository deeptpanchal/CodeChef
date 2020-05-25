import java.util.*;

public class Main
{
	static int solve(int h[], int n, int u, int d) 
	{
		boolean parachute = true;
		for (int i = 0; i < n - 1; i++) 
		{
			if (h[i] < h[i + 1] - u)
			{
				return i + 1;
			} 
			else if (h[i] > h[i + 1] + d) 
			{
				if (!parachute) 
				{
					return i + 1;
				}
				else
				{
					parachute = false;
				}
			}
		}
		return n;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int u = s.nextInt();
			int d = s.nextInt();
			int h[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				h[i] = s.nextInt();
			}
			System.out.println(solve(h, n, u, d));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static int solve(int a[], int m, int x, int y) 
	{
		boolean bool[] = new boolean[100];
		for (int i = 0; i < m; i++) 
		{
			Arrays.fill(bool, Math.max(a[i] - x * y - 1, 0), Math.min(a[i] + x * y, 100), true);
		}
		int count = 0;
		for (int i = 0; i < 100; i++) 
		{
			if (!bool[i])
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0)
		{
			int m = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			int a[] = new int[m];
			for (int i = 0; i < m; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, m, x, y));
		}
		s.close();
	}
}

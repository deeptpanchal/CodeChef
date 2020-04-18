import java.util.*;

public class Main 
{
	static int solve(int a[][], int n) 
	{
		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = 0; j < n - i - 1; j++) 
			{
				a[n - 2 - i][j] += Math.max(a[n - 1 - i][j], a[n - 1 - i][j + 1]);
			}
		}
		return a[0][0];
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int a[][] = new int[n][];
			for (int i = 0; i < n; i++) 
			{
				a[i] = new int[i + 1];
				for (int j = 0; j <= i; j++) 
				{
					a[i][j] = s.nextInt();
				}
			}
			System.out.println(solve(a, n));
		}
		s.close();
	}
}

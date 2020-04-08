import java.util.*;

public class Main 
{
	static boolean solve(int a[], int n, int sum) 
	{
		if (sum == 0) 
		{
			return true;
		}
		if (n == 0) 
		{
			return false;
		}
		return solve(a, n - 1, sum) || solve(a, n - 1, sum - a[n - 1]);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int sum = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n, sum) ? "Yes" : "No");
		}
		s.close();
	}
}

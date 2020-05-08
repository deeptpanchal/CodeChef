import java.util.*;

public class Main 
{
	static int solve(int a[], int n, int k) 
	{
		int sum = 0;
		for (int i = 0; i < k; i++) 
		{
			sum = sum + a[i];
		}
		int max = sum;
		for (int i = k; i < n; i++)
		{
			sum = sum + a[i] - a[i - k];
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n, k));
		}
		s.close();
	}
}

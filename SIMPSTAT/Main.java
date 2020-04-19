import java.util.*;

public class Main 
{
	static double solve(int a[], int n, int k) 
	{
		Arrays.sort(a);
		int sum = 0;
		for (int i = k; i < n - k; i++) 
		{
			sum = sum + a[i];
		}
		return (double) sum / (n - 2 * k);
	}

	public static void main(String[] args) 
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
			System.out.printf("%.6f\n", solve(a, n, k));
		}
		s.close();
	}
}

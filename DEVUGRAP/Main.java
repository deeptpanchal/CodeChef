import java.util.*;

public class Main 
{
	static long solve(int a[], int n, int k) 
	{
		long sum = 0;
		for (int i = 0; i < n; i++) 
		{
			if(a[i] < k)
			{
				sum = sum + k - a[i];
			}
			else
			{
				sum = sum + Math.min(a[i] % k, k - a[i] % k);
			}
		}
		return sum;
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
			System.out.println(solve(a, n, k));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static long solve(int a[], int n) 
	{
		Arrays.sort(a);
		long sum = 0;
		for (int i = 0; i < n / 2; i++) 
		{
			sum = sum + Math.abs(a[i] - a[n - 1 - i]);
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
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n));
		}
		s.close();
	}
}

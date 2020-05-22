import java.util.*;

public class Main
{
	static long solve(int a[], int b[], int n) 
	{
		Arrays.sort(a);
		Arrays.sort(b);
		long sum = 0;
		for (int i = 0; i < n; i++) 
		{
			sum = sum + Math.min(a[i], b[i]);
		}
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}

			for (int i = 0; i < n; i++) 
			{
				b[i] = s.nextInt();
			}
			System.out.println(solve(a, b, n));
		}
		s.close();
	}
}

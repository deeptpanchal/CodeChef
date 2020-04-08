import java.util.*;

public class Main 
{
	static long solve(int a[], int d) 
	{
		Arrays.sort(a);
		long ans = 0;
		for (int i = a.length - 1; i > 0; i--) 
		{
			if (a[i] - a[i - 1] < d) 
			{
				ans += a[i] + a[i - 1];
				i--;
			}
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int d = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, d));
		}
		s.close();
	}
}

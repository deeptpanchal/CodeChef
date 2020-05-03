import java.util.*;

public class Main 
{
	static int solve(int a[], int b[], int n) 
	{
		int count = b[0] <= a[0] ? 1 : 0;
		for (int i = 1; i < n; i++) 
		{
			if (b[i] <= a[i] - a[i - 1]) 
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

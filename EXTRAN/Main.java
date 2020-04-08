import java.util.*;

public class Main 
{
	static int solve(int a[], int n) 
	{
		if (a[0] != a[1] - 1) 
		{
			return a[0];
		}
		for (int i = 1; i < n; i++) 
		{
			if (a[i] != a[i - 1] + 1) 
			{
				return a[i];
			}
		}
		return a[n - 1];
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			Arrays.sort(a);
			System.out.println(solve(a, n));
		}
		s.close();
	}
}

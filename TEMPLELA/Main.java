import java.util.*;

public class Main 
{
	static String solve(int a[], int n) 
	{
		if (n % 2 == 0) 
		{
			return "no";
		}
		for (int i = 0; i <= n / 2; i++) 
		{
			if (a[i] != i + 1 || a[n - 1 - i] != i + 1) 
			{
				return "no";
			}
		}
		return "yes";
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

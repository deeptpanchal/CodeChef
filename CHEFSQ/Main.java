import java.util.*;

public class Main 
{
	static String solve(int a[], int n, int f[], int m) 
	{
		int j = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] == f[j]) 
			{
				j++;
				if (j == m) 
				{
					return "Yes";
				}
			}
		}
		return "No";
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
			int m = s.nextInt();
			int f[] = new int[m];
			for (int i = 0; i < m; i++) 
			{
				f[i] = s.nextInt();
			}
			System.out.println(solve(a, n, f, m));
		}
		s.close();
	}
}

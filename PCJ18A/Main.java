import java.util.*;

public class Main 
{
	static String solve(int a[], int n, int x) 
	{
		for (int i = 0; i < n; i++) 
		{
			if (a[i] >= x) 
			{
				return "YES";
			}
		}
		return "NO";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int x = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n, x));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static String solve(int a[], int n, int k) 
	{
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] % 2 == 0) 
			{
				count++;
			}
		}
		return count < k || (k == 0 && count == n) ? "NO" : "YES";
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

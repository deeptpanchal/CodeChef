import java.util.*;

public class Main
{
	static int solve(int a[], int k, int n)
	{
		int count = 0;
		for (int i = 1; i <= n; i++) 
		{
			int diff = a[i] - a[i - 1];
			if (diff > k)
			{
				count = count + diff / k + (diff % k == 0 ? -1 : 0);
			}
		}
		return count;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n + 1];
			for (int i = 1; i <= n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, k, n));
		}
		s.close();
	}
}

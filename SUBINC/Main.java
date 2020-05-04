import java.util.*;

public class Main 
{
	static long solve(int a[], int n) 
	{
		long ans = 0;
		for (int i = 0; i < n; i++) 
		{
			int count = 1;
			while (i + 1 < n && a[i] <= a[i + 1]) 
			{
				count++;
				i++;
			}
			ans = ans + (long) count * (count + 1) / 2;
		}
		return ans;
	}

	public static void main(String args[]) 
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

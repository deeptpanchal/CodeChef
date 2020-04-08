import java.util.*;

public class Main 
{
	static long solve(long a[], long m) 
	{
		for (int i = a.length - 1; i >= 0; i--) 
		{
			m -= a[i];
			if (m <= 0) 
			{
				return a.length - i;
			}
		}
		return -1;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			long m = s.nextLong();
			long a[] = new long[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextLong();
			}
			Arrays.sort(a);
			System.out.println(solve(a, m));
		}
		s.close();
	}
}

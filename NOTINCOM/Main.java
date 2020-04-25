import java.util.*;

public class Main 
{
	static int solve(int a[], int n, int b[], int m) 
	{
		Arrays.sort(b);
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			if (Arrays.binarySearch(b, a[i]) >= 0) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			int b[] = new int[m];
			for (int i = 0; i < m; i++) 
			{
				b[i] = s.nextInt();
			}
			System.out.println(solve(a, n, b, m));
		}
		s.close();
	}
}

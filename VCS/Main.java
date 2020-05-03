import java.util.*;

public class Main 
{
	static String solve(int a[], int b[], int n, int m, int k) 
	{
		int temp[] = new int[n];
		Arrays.fill(temp, 0);
		for (int i = 0; i < m; i++) 
		{
			temp[a[i] - 1]++;
		}
		for (int i = 0; i < k; i++) 
		{
			temp[b[i] - 1]++;
		}
		int ans1 = 0;
		int ans2 = 0;
		for (int i = 0; i < n; i++)
		{
			if (temp[i] == 2) 
			{
				ans1++;
			}
			if (temp[i] == 0) 
			{
				ans2++;
			}
		}
		return String.valueOf(ans1 + " " + ans2);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[m];
			for (int i = 0; i < m; i++)
			{
				a[i] = s.nextInt();
			}
			int b[] = new int[k];
			for (int i = 0; i < k; i++) 
			{
				b[i] = s.nextInt();
			}
			System.out.println(solve(a, b, n, m, k));
		}
		s.close();
	}
}

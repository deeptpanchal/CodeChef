import java.util.*;

public class Main 
{
	static int gcd(int a, int b) 
	{
		if (b == 0) 
		{
			return a;
		}
		return gcd(b, a % b);
	}

	static int solve(int a[], int n) 
	{
		int ans = a[0];
		for (int i = 1; i < n; i++) 
		{
			ans = gcd(ans, a[i]);
		}
		return ans;
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
			int temp = solve(a, n);
			System.out.println();
			for (int i = 0; i < n; i++) 
			{
				System.out.print(a[i] / temp + " ");
			}
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static int digit(int n) 
	{
		int sum = 0;
		for (int i = n; i > 0; i = i / 10) 
		{
			sum = sum + i % 10;
		}
		return sum;
	}

	static int solve(int a[], int n) 
	{
		int max = 0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				max = Math.max(max, digit(a[i] * a[j]));
			}
		}
		return max;
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

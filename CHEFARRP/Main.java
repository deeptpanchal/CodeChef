import java.util.*;

public class Main 
{
	static int solve(int a[], int n) 
	{
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			int sum = 0;
			int product = 1;
			for (int j = i; j < n; j++) 
			{
				sum = sum + a[j];
				product = product * a[j];
				if (sum == product) 
				{
					count++;
				}
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

import java.util.*;

public class Main 
{
	static int solve(int a[], int n) 
	{
		Arrays.sort(a);
		for (int i = n - 1; i > 0; i--) 
		{
			if (a[i] == a[i - 1]) 
			{
				for (int j = i - 2; j > 0; j--)
				{
					if (a[j] == a[j - 1]) 
					{
						return a[i] * a[j];
					}
				}
				break;
			}
		}
		return -1;
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

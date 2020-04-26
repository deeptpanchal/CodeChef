import java.util.*;

public class Main 
{
	static String solve(int a[], int n) 
	{
		long sum = 0;
		for (int i = 0; i < n; i++) 
		{
			sum = sum + a[i];
		}
		if (sum % n == 0) 
		{
			for (int i = 0; i < n; i++) 
			{
				if (a[i] == (int) (sum / n)) 
				{
					return String.valueOf(i + 1);
				}
			}
		}
		return "Impossible";
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

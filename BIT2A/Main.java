import java.util.*;

public class Main 
{
	static int[] solve(int a[], int n) 
	{
		int b[] = new int[n];
		for (int i = n - 1; i >= 0; i--) 
		{
			if (i == n - 1) 
			{
				b[i] = 0;
			} 
			else if (a[i] != a[i + 1]) 
			{
				b[i] = n - 1 - i;
			} 
			else 
			{
				b[i] = b[i + 1];
			}
		}
		return b;
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
			int b[] = solve(a, n);
			for (int i = 0; i < n; i++) 
			{
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static int solve(int a[], int b[], int n) 
	{
		int max = 0;
		for (int i = 0; i < n; i++) 
		{
			max = Math.max(max, 2 * a[i] - b[i]);
		}
		return max * 10;
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
			int b[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				b[i] = s.nextInt();
			}
			System.out.println(solve(a, b, n));
		}
		s.close();
	}
}

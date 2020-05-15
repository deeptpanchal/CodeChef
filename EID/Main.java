import java.util.*;

public class Main 
{
	static int solve(int a[], int n)
	{
		Arrays.sort(a);
		int min = 1000000;
		for (int i = 1; i < n; i++) 
		{
			min = Math.min(min, a[i] - a[i - 1]);
			if (min == 0) 
			{
				break;
			}
		}
		return min;
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

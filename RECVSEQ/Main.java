import java.util.*;

public class Main 
{
	static int[] solve(int a[]) 
	{
		if (a[2] == 2 * a[1] - a[0] || a[3] == 3 * a[1] - 2 * a[0]) 
		{
			return new int[] { a[0], a[1] - a[0] };
		} 
		else 
		{
			return new int[] { 3 * a[2] - 2 * a[3], a[3] - a[2] };
		}
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
			int b[] = solve(a);
			for (int i = 0; i < n; i++) 
			{
				System.out.print(b[0] + b[1] * i + " ");
			}
			System.out.println();
		}
		s.close();
	}
}

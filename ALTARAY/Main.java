import java.util.*;

public class Main 
{
	static int[] solve(int a[], int n) 
	{
		int b[] = new int[n];
		b[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) 
		{
			b[i] = a[i] * a[i + 1] < 0 ? b[i] = b[i + 1] + 1 : 1;
		}
		return b;
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
				a[i] = s.nextInt() > 0 ? 1 : -1;
			}
			for (int i : solve(a, n)) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static int[] solve(int n, int k) 
	{
		if (k == 1) 
		{
			return new int[] { 1 };
		}
		if (k > n / 2) 
		{
			return new int[] { -1 };
		}
		int a[] = new int[k];
		for (int i = 0; i < k; i++) 
		{
			a[i] = (i + 1) * 2;
		}
		return a;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = solve(n, k);
			for (int i : a) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		s.close();
	}
}

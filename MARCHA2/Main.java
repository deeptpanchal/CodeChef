import java.util.*;

public class Main 
{
	static boolean solve(int a[]) 
	{
		int stem = 1;
		for (int leaf : a) 
		{
			if (leaf > stem) 
			{
				return false;
			}
			stem = (stem - leaf) * 2;
		}
		return stem == 0;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a) ? "Yes" : "No");
		}
		s.close();
	}
}

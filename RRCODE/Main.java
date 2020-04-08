import java.util.*;

public class Main 
{
	static int solve(int n, int k, int ans, int a[], String op) 
	{
		if (k == 0 || (op.equals("XOR") && k % 2 == 0)) 
		{
			return ans;
		}
		for (int j = 0; j < n; j++) 
		{
			if (op.equals("XOR")) 
			{
				ans = ans ^ a[j];
			}
			if (op.equals("AND")) 
			{
				ans = ans & a[j];
			}
			if (op.equals("OR")) 
			{
				ans = ans | a[j];
			}
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int ans = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			String op = s.next();
			System.out.println(solve(n, k, ans, a, op));
		}
		s.close();
	}
}

import java.util.*;

public class Main
{
	static String solve(int a[], String str, int n) 
	{
		return str.equals("Dee") && n == 1 && a[0] % 2 == 0 ? "Dee" : "Dum";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			String str = s.next();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, str, n));
		}
		s.close();
	}
}

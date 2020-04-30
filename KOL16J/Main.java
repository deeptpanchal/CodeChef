import java.util.*;

public class Main 
{
	static String solve(int a[], int n) 
	{
		int b[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			b[i] = i + 1;
		}
		if (Arrays.equals(a, b)) 
		{
			return "no";
		}
		Arrays.sort(a);
		return Arrays.equals(a, b) ? "yes" : "no";
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

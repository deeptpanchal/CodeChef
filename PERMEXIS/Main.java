import java.util.*;

public class Main 
{
	static String solve(int a[]) 
	{
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) 
		{
			if (Math.abs(a[i + 1] - a[i]) > 1) 
			{
				return "NO";
			}
		}
		return "YES";
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
			System.out.println(solve(a));
		}
		s.close();
	}
}

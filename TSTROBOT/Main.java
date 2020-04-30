import java.util.*;

public class Main 
{
	static int solve(String str, int n, int x) 
	{
		int x_min = x;
		int x_max = x;
		for (int i = 0; i < n; i++) 
		{
			x = str.charAt(i) == 'R' ? ++x : --x;
			x_max = Math.max(x_max, x);
			x_min = Math.min(x_min, x);
		}
		return x_max - x_min + 1;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int x = s.nextInt();
			String str = s.next();
			System.out.println(solve(str, n, x));
		}
		s.close();
	}
}

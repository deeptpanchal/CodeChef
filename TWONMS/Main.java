import java.util.*;

public class Main 
{
	static int solve(int a, int b, int n) 
	{
		if (n % 2 != 0) 
		{
			a = 2 * a;
		}
		return Math.max(a, b) / Math.min(a, b);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			System.out.println(solve(a, b, n));
		}
		s.close();
	}
}

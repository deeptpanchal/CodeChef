import java.util.*;

public class Main 
{
	static String solve(int a, int b, int c, int x, int y) 
	{
		return a + b + c == x + y && Math.min(a, Math.min(b, c)) <= Math.min(x, y) ? "YES" : "NO";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(solve(a, b, c, x, y));
		}
		s.close();
	}
}

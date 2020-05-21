import java.util.*;

public class Main 
{
	static String solve(int a, int b, int c, int d)
	{
		int x = Math.abs(a - b);
		int y = Math.abs(c - d);
		return (x == 0 && y == 0) || (y != 0 && x % y == 0) ? "YES" : "NO";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			System.out.println(solve(a, b, c, d));
		}
		s.close();
	}
}

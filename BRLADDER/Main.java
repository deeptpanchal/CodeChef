import java.util.*;

public class Main
{
	static String solve(int a, int b) 
	{
		int diff = Math.abs(a - b);
		return (diff == 2) || (diff == 1 && Math.max(a, b) % 2 == 0) ? "YES" : "NO";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(solve(a, b));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static int solve(int x, int y) 
	{
		return Math.max(x - y, 0);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(solve(x, y));
		}
		s.close();
	}
}

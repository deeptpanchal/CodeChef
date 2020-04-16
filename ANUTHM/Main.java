import java.util.*;

public class Main 
{
	static int solve(int n, int m) 
	{
		return n + m - 1;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println(solve(n, m));
		}
		s.close();
	}
}

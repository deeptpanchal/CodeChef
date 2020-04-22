import java.util.*;

public class Main 
{
	static int solve(int n, int m) 
	{
		return 2 * n * m - n - m;
	}

	public static void main(String[] args) 
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

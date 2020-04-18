import java.util.*;

public class Main 
{
	static long solve(long n) 
	{
		return ((long) Math.sqrt(8 * n + 1) - 1) / 2;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}

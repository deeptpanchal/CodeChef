import java.util.*;

public class Main 
{
	static String solve(long c, long d, long l) 
	{
		if (l % 4 != 0) 
		{
			return "no";
		}
		return (l <= (c + d) * 4 && l >= 4 * d + Math.max(0, (c - 2 * d) * 4)) ? "yes" : "no";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long c = s.nextLong();
			long d = s.nextLong();
			long l = s.nextLong();
			System.out.println(solve(c, d, l));
		}
		s.close();
	}
}

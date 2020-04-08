import java.util.*;

public class Main 
{
	static long solve(long a, long b, long c) 
	{
		if (a + c == 2 * b) 
		{
			return 0;
		} 
		else if ((a + c) % 2 == 0) 
		{
			return Math.abs((a + c) / 2 - b);
		} 
		else 
		{
			return Math.min(Math.abs((a + c + 1) / 2 - b), Math.abs((a + c - 1) / 2 - b)) + 1;
		}
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			long a = s.nextLong();
			long b = s.nextLong();
			long c = s.nextLong();
			System.out.println(solve(a, b, c));
		}
		s.close();
	}
}

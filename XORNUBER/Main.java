import java.util.*;

public class Main 
{
	static int solve(int n) 
	{
		if (n == 1)
			return 2;
		if (Integer.bitCount(n + 1) == 1)
			return n / 2;
		return -1;

	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}

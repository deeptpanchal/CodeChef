import java.util.*;

public class Main 
{
	static int solve(int a, int b, int n) 
	{
		int c = n % 2 == 0 ? Integer.compare(Math.abs(a), Math.abs(b)) : Integer.compare(a, b);
		return c == 0 ? 0 : c > 0 ? 1 : 2;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			System.out.println(solve(a, b, n));
		}
		s.close();
	}
}

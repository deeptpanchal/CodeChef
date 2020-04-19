import java.util.*;

public class Main 
{
	static String solve(int n, int m) 
	{
		if (n % 2 == 0 || m % 2 == 0) 
		{
			return "YES";
		}
		return "NO";
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

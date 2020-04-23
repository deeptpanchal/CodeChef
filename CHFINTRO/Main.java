import java.util.*;

public class Main 
{
	static String solve(int n, int r) 
	{
		return (n >= r) ? "Good boi" : "Bad boi";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int r = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n, r));
		}
		s.close();
	}
}

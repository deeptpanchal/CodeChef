import java.util.*;

public class Main 
{
	static float solve(int n) 
	{
		if (n < 1500)
		{
			return n+0.1f*n+0.9f*n;
		}
		return n+500+0.98f*n;
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

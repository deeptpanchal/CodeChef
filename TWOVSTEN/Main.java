import java.util.*;

public class Main 
{
	static int solve(int x) 
	{
		if (x % 5 != 0) 
		{
			return -1;
		}
		if (x % 10 == 0) 
		{
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int x = s.nextInt();
			System.out.println(solve(x));
		}
		s.close();
	}
}

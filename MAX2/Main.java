import java.util.*;

public class Main 
{
	static int solve(String str, int n) 
	{
		for (int i = 0; i < n; i++) 
		{
			if (str.charAt(n - 1 - i) == '1') 
			{
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		System.out.println(solve(str, n));
		s.close();
	}
}

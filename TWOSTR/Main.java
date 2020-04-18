import java.util.*;

public class Main 
{
	static String solve(String x, String y) 
	{
		for (int i = 0; i < x.length(); i++) 
		{
			if (x.charAt(i) != y.charAt(i) && x.charAt(i) != '?' && y.charAt(i) != '?') 
			{
				return "No";
			}
		}
		return "Yes";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			String x = s.next();
			String y = s.next();
			System.out.println(solve(x, y));
		}
		s.close();
	}
}

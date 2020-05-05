import java.util.*;
import java.util.regex.Pattern;

public class Main 
{
	static String solve(String str) 
	{
		return str.charAt(0) != str.charAt(1)
			&& Pattern.matches("(" + str.substring(0, 2) + ")*(" + str.charAt(0) + "|)", str) ? "YES" : "NO";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			System.out.println(solve(str));
		}
		s.close();
	}
}

import java.util.*;
import java.util.regex.Pattern;

public class Main 
{
	static String solve(String str) 
	{
		if (Pattern.matches("[0]*[1]+[0]*", str)) 
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
			String str = s.next();
			System.out.println(solve(str));
		}
		s.close();
	}
}

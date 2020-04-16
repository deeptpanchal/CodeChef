import java.util.*;
import java.util.regex.*;

public class Main 
{
	static String solve(String str) 
	{
		if (!Pattern.compile("[a-h][1-8][-][a-h][1-8]").matcher(str).matches()) 
		{
			return "Error";
		}
		if (Math.abs((str.charAt(0) - str.charAt(3)) * (str.charAt(1) - str.charAt(4))) == 2) 
		{
			return "Yes";
		}
		return "No";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.nextLine();
		while (x-- > 0) 
		{
			String str = s.nextLine();
			System.out.println(solve(str));
		}
		s.close();
	}
}

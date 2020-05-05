import java.util.*;
import java.util.regex.Pattern;

public class Main 
{
	static String solve(String str) 
	{
		return Pattern.matches("([0]*[1]*[0]*|[1]*[0]*[1]*)", str) ? "uniform" : "non-uniform";
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

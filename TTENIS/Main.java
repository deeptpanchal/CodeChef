import java.util.*;

public class Main 
{
	static String solve(String str) 
	{
		return str.charAt(str.length() - 1) == '1' ? "WIN" : "LOSE";
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

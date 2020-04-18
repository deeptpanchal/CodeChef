import java.util.*;

public class Main 
{
	static String solve(String n) 
	{
		if ((n.contains("0") && n.indexOf('0') == n.lastIndexOf('0')) || (n.contains("1") && n.indexOf('1') == n.lastIndexOf('1'))) 
		{
			return "Yes";
		}
		return "No";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String n = s.next();
			System.out.println(solve(n));
		}
		s.close();
	}
}

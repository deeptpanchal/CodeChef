import java.util.*;

public class Main 
{
	static String solve(String str) 
	{
		if (str.contains("I")) 
		{
			return "INDIAN";
		}
		if (str.contains("Y")) 
		{
			return "NOT INDIAN";
		}
		return "NOT SURE";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			String str = s.next();
			System.out.println(solve(str));
		}
		s.close();
	}
}

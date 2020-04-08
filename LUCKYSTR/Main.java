import java.util.*;

public class Main 
{
	static String solve(String temp, String str[]) 
	{
		if (temp.length() >= 47) 
		{
			return "Good";
		} 
		else 
		{
			for (int i = 0; i < str.length; i++) 
			{
				if (temp.contains(str[i])) 
				{
					return "Good";
				}
			}
		}
		return "Bad";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		String str[] = new String[k];
		for (int i = 0; i < k; i++) 
		{
			str[i] = s.next();
		}
		while (n-- > 0) 
		{
			System.out.println(solve(s.next(), str));
		}
		s.close();
	}
}

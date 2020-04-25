import java.util.*;

public class Main 
{
	static String solve(String str[], int n) 
	{
		if (str[n - 1].equals("cookie")) 
		{
			return "NO";
		}
		for (int i = 0; i < n - 1; i++) 
		{
			if (str[i].equals("cookie") && str[i + 1].equals("cookie")) 
			{
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			String str[] = new String[n];
			for (int i = 0; i < n; i++) 
			{
				str[i] = s.next();
			}
			System.out.println(solve(str, n));
		}
		s.close();
	}
}

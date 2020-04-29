import java.util.*;

public class Main 
{
	static boolean check(char ch) 
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
			return true;
		}
		return false;
	}

	static int solve(String str, int n) 
	{
		int count = 0;
		for (int i = 0; i < n - 1; i++) 
		{
			if (!check(str.charAt(i)) && check(str.charAt(i + 1))) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			String str = s.next();
			System.out.println(solve(str, n));
		}
		s.close();
	}
}

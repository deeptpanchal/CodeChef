import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		int count[] = new int[26];
		int len = str.length();
		for (int i = 0; i < len; i++) 
		{
			count[str.charAt(i) - 'a']++;
		}
		return Math.min(count[2] / 2, Math.min(count[3], Math.min(count[4] / 2, Math.min(count[5], Math.min(count[7], count[14])))));
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int n = s.nextInt();
			String str = "";
			for (int i = 0; i < n; i++)
			{
				str = str + s.next();
			}
			System.out.println(solve(str));
		}
		s.close();
	}
}

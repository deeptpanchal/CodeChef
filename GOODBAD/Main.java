import java.util.*;

public class Main 
{
	static String solve(String str, int n, int k) 
	{
		int u = 0;
		int l = 0;
		for (int i = 0; i < n; i++) 
		{
			if (Character.isUpperCase(str.charAt(i))) 
			{
				u++;
			}
			else 
			{
				l++;
			}
		}
		boolean chef = l + k >= n ? true : false;
		boolean brother = u + k >= n ? true : false;
		if (chef && brother) 
		{
			return "both";
		} 
		else if (chef) 
		{
			return "chef";
		} 
		else if (brother) 
		{
			return "brother";
		} 
		else 
		{
			return "none";
		}
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			String str = s.next();
			System.out.println(solve(str, n, k));
		}
		s.close();
	}
}

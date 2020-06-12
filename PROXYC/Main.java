import java.util.*;

public class Main 
{
	static int solve(String str, int n) 
	{
		int p = str.replace("A", "").length();
		if ((double) p / n >= 0.75) 
		{
			return 0;
		} 
		else 
		{
			int count = 0;
			for (int i = 2; i < n - 2; i++) 
			{
				if (str.charAt(i) == 'A' && (str.charAt(i - 2) == 'P' || str.charAt(i - 1) == 'P') && (str.charAt(i + 1) == 'P' || str.charAt(i + 2) == 'P'))
				{
					count++;
					p++;
					if ((double) p / n >= 0.75)
					{
						return count;
					}
				}

			}
		}
		return -1;
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

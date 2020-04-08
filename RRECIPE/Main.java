import java.util.*;

public class Main 
{
	static long ans(char ch1, char ch2) 
	{
		if (ch1 == ch2) 
		{
			if (ch1 == '?') 
			{
				return 26;
			} 
			else 
			{
				return 1;
			}
		} 
		else 
		{
			if (ch1 == '?' || ch2 == '?') 
			{
				return 1;
			} 
			else 
			{
				return 0;
			}
		}
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			int l = str.length();
			long ans = 1;
			for (int i = 0, j = l - 1; i <= j; i++, j--) 
			{
				long temp = ans(str.charAt(i), str.charAt(j));
				if (temp == 0) 
				{
					ans = 0;
					break;
				} 
				else 
				{
					ans = ans * temp;
					ans = ans % 10000009;
				}
			}
			System.out.println(ans);
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static String ans(String str1, String str2) 
	{
		int index = 0;
		for (int i = 0; i < str1.length(); i++) 
		{
			if (str2.indexOf(str1.charAt(i), index) < 0) 
			{
				return "NO";
			}
			index = str2.indexOf(str1.charAt(i), index) + 1;
		}
		return "YES";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str1 = s.next();
			String str2 = s.next();
			if (str1.length() > str2.length()) 
			{
				String str = str1;
				str1 = str2;
				str2 = str;
			}
			System.out.println(ans(str1, str2));
		}
		s.close();
	}
}

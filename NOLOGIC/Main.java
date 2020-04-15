import java.util.*;

public class Main 
{
	static String solve(String str) 
	{
		String ans = "";
		int a[] = new int[26];
		Arrays.fill(a, 0);
		for (int i = 0; i < str.length(); i++) 
		{
			char temp = str.charAt(i);
			if (temp >= 'a' && temp <= 'z') 
			{
				a[temp - 'a'] = 1;
			}
		}
		for (int i = 0; i < 26; i++) 
		{
			if (a[i] == 0) 
			{
				ans = ans + (char) ('a' + i);
			}
		}
		return (ans == "") ? "~" : ans;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while (t-- > 0) 
		{
			String str = s.nextLine();
			System.out.println(solve(str.toLowerCase()));
		}
		s.close();
	}
}

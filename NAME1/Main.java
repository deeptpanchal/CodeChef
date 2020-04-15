import java.util.*;

public class Main 
{
	static String solve(String a, String b, String[] c, int n) 
	{
		int temp[] = new int[26];
		Arrays.fill(temp, 0);
		for (int i = 0; i < a.length(); i++) 
		{
			temp[a.charAt(i) - 'a']++;
		}
		for (int i = 0; i < b.length(); i++) 
		{
			temp[b.charAt(i) - 'a']++;
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < c[i].length(); j++) 
			{
				if (temp[c[i].charAt(j) - 'a'] == 0) 
				{
					return "NO";
				}
				temp[c[i].charAt(j) - 'a']--;
			}
		}
		return "YES";
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String a = s.next();
			String b = s.next();
			int n = s.nextInt();
			String c[] = new String[n];
			for (int i = 0; i < n; i++) 
			{
				c[i] = s.next();
			}
			System.out.println(solve(a, b, c, n));
		}
		s.close();
	}
}

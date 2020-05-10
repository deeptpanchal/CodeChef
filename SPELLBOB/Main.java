import java.util.*;

public class Main 
{
	static boolean check(String str1, String str2, char c[]) 
	{
		for (int i = 0; i < 3; i++) 
		{
			if (!(str1.charAt(i) == c[i] || str2.charAt(i) == c[i])) 
			{
				return false;
			}
		}
		return true;
	}

	static String solve(String str1, String str2) 
	{
		char ch[][] = new char[][] { { 'b', 'b', 'o' }, { 'b', 'o', 'b' }, { 'o', 'b', 'b' } };
		return check(str1, str2, ch[0]) || check(str1, str2, ch[1]) || check(str1, str2, ch[2]) ? "yes" : "no";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str1 = s.next();
			String str2 = s.next();
			System.out.println(solve(str1, str2));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static String solve(char ch[]) 
	{
		int len = 0;
		int count = 1;
		for (int i = 1; i < ch.length; i++) 
		{
			if (ch[i] == ch[i - 1]) 
			{
				count++;
			} 
			else 
			{
				len += String.valueOf(count).length() + 1;
				count = 1;
			}
		}
		return len < ch.length - 1 ? "YES" : "NO";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next() + " ";
			System.out.println(solve(str.toCharArray()));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static String solve(String str) 
	{
		char[] ch = str.toCharArray();
		for (int i = ch.length - 4; i >= 0; i--) 
		{
			if ((ch[i] == '?' || ch[i] == 'C') && (ch[i + 1] == '?' || ch[i + 1] == 'H') && (ch[i + 2] == '?' || ch[i + 2] == 'E') && (ch[i + 3] == '?' || ch[i + 3] == 'F')) 
			{
				ch[i] = 'C';
				ch[i + 1] = 'H';
				ch[i + 2] = 'E';
				ch[i + 3] = 'F';
				i--;
				i--;
				i--;
			}
		}
		return String.valueOf(ch).replaceAll("\\?", "A");
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			System.out.println(solve(str));
		}
		s.close();
	}
}

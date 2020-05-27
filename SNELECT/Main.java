import java.util.*;

public class Main 
{
	static String solve(char ch[])
	{
		int count = 0;
		for (int i = 0; i < ch.length - 1; i++)
		{
			if (ch[i] == 's' && ch[i + 1] == 'm') 
			{
				ch[i] = 'x';
				i++;
			}
			else if (ch[i] == 'm' && ch[i + 1] == 's') 
			{
				ch[i + 1] = 'x';
				i++;
			}
		}
		for (int i = 0; i < ch.length; i++) 
		{
			count = ch[i] == 's' ? ++count : ch[i] == 'm' ? --count : count;
		}
		return count > 0 ? "snakes" : count < 0 ? "mongooses" : "tie";
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			System.out.println(solve(str.toCharArray()));
		}
		s.close();
	}
}

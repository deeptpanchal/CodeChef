import java.util.*;

public class Main 
{
	static String solve(char ch[]) 
	{
		int a = 0;
		int b = 0;
		int index = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] == 'A') 
			{
				a += ch[index] == 'A' && index != i ? i - index : 1;
				index = i;
			} 
			else if (ch[i] == 'B') 
			{
				b += ch[index] == 'B' && index != i ? i - index : 1;
				index = i;
			}
		}
		return a + " " + b;
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

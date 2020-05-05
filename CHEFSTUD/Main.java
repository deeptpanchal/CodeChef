import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) 
		{
			if (str.charAt(i) == '<' && str.charAt(i + 1) == '>') 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
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

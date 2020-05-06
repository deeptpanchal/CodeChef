import java.util.*;

public class Main 
{
	static String solve(char ch[], int n) 
	{
		int x = 0;
		int y = 0;
		for (int i = 1; i <= n; i++) 
		{
			if (ch[i] == 'L' && ch[i - 1] != 'L' && ch[i - 1] != 'R') 
			{
				x--;
			} 
			else if (ch[i] == 'R' && ch[i - 1] != 'R' && ch[i - 1] != 'L') 
			{
				x++;
			} 
			else if (ch[i] == 'U' && ch[i - 1] != 'U' && ch[i - 1] != 'D') 
			{
				y++;
			} 
			else if (ch[i] == 'D' && ch[i - 1] != 'D' && ch[i - 1] != 'U') 
			{
				y--;
			}
		}
		return x + " " + y;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			String str = "X" + s.next();
			System.out.println(solve(str.toCharArray(), n));
		}
		s.close();
	}
}

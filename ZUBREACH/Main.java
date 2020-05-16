import java.util.*;

public class Main
{
	static String solve(int m, int n, int Rx, int Ry, int l, char ch[])
	{
		int x = 0;
		int y = 0;
		for (int i = 0; i < l; i++) 
		{
			if (ch[i] == 'U')
			{
				y++;
			}
			else if (ch[i] == 'D')
			{
				y--;
			} 
			else if (ch[i] == 'R') 
			{
				x++;
			} 
			else if (ch[i] == 'L') 
			{
				x--;
			}
		}
		return x == Rx && y == Ry ? "REACHED" : x < 0 || y < 0 || x > m || y > n ? "DANGER" : "SOMEWHERE";
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int i = 1; i <= x; i++) 
		{
			int m = s.nextInt();
			int n = s.nextInt();
			int Rx = s.nextInt();
			int Ry = s.nextInt();
			int l = s.nextInt();
			String str = s.next();
			System.out.println("Case " + i + ": " + solve(m, n, Rx, Ry, l, str.toCharArray()));
		}
		s.close();
	}
}

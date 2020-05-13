import java.util.*;

public class Main
{
	static int solve(String str) 
	{
		int c = 0;
		int h = 0;
		int e = 0;
		int f = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch == 'C') 
			{
				c++;
			} 
			else if (ch == 'H' && h < c) 
			{
				h++;
			} 
			else if (ch == 'E' && e < h) 
			{
				e++;
			} 
			else if (ch == 'F' && f < e) 
			{
				f++;
			}
		}
		return f;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(solve(str));
		s.close();
	}
}

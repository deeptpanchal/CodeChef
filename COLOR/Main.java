import java.util.*;

public class Main 
{
	static int solve(String str, int n) 
	{
		int r = 0;
		int g = 0;
		int b = 0;
		for (int i = 0; i < n; i++) 
		{
			if (str.charAt(i) == 'R') 
			{
				r++;
			} 
			else if (str.charAt(i) == 'G') 
			{
				g++;
			} 
			else 
			{
				b++;
			}
		}
		return n - Math.max(Math.max(r, g), b);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			String str = s.next();
			System.out.println(solve(str, n));
		}
		s.close();
	}
}

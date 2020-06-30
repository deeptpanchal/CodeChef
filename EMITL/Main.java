import java.util.*;

public class Main 
{
	static String solve(String str) 
	{
		int len = str.length();
		int L = 0;
		int T = 0;
		int I = 0;
		int M = 0;
		int E = 0;
		int O = 0;
		for (int i = 0; i < len; i++) 
		{
			if (str.charAt(i) == 'L') 
			{
				L++;
			} 
			else if (str.charAt(i) == 'T') 
			{
				T++;
			} 
			else if (str.charAt(i) == 'I') 
			{
				I++;
			} 
			else if (str.charAt(i) == 'M')
			{
				M++;
			} 
			else if (str.charAt(i) == 'E') 
			{
				E++;
			} 
			else 
			{
				O++;
			}
		}
		if (L > 1 && T > 1 && I > 1 && M > 1) 
		{
			if ((O == 0 && E > 0) || (O > 0 && E > 1)) 
			{
				return "YES";
			}
		}
		return "NO";
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

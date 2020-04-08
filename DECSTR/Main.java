import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		String ans = "";
		int add = 0;
		while (n != 0) 
		{
			ans = (char) ('a' + add) + ans;
			if (ans.length() > 1 && ans.charAt(0) > ans.charAt(1)) 
			{
				n--;
			}
			add = (add + 1) % 26;
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}

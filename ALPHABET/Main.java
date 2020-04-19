import java.util.*;

public class Main 
{
	static String solve(String w, boolean bool[]) 
	{
		for (int i = 0; i < w.length(); i++) 
		{
			if (!bool[w.charAt(i) - 'a']) 
			{
				return "No";
			}
		}
		return "Yes";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean bool[] = new boolean[26];
		for (int i = 0; i < str.length(); i++) 
		{
			bool[str.charAt(i) - 'a'] = true;
		}
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String w = s.next();
			System.out.println(solve(w, bool));
		}
		s.close();
	}
}

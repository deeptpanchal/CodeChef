import java.util.*;

public class Main 
{
	static String solve(char ch[]) 
	{
		Set<Character> s = new HashSet<>();
		for (char c : ch) 
		{
			if (s.contains(c))
			{
				return "yes";
			}
			s.add(c);
		}
		return "no";
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

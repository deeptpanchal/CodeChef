import java.util.*;

public class Main 
{
	static String solve(String a, String b)
	{
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < a.length(); i++)
		{
			hs.add(a.charAt(i));
		}
		for (int i = 0; i < b.length(); i++) 
		{
			if (hs.contains(b.charAt(i))) 
			{
				return "Yes";
			}
		}
		return "No";
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String a = s.next();
			String b = s.next();
			System.out.println(solve(a, b));
		}
		s.close();
	}
}

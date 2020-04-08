import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < str.length() - 1; i++) 
		{
			hs.add(str.substring(i, i + 2));
		}
		return hs.size();
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			System.out.println(solve(s.next()));
		}
		s.close();
	}
}

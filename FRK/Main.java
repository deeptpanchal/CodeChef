import java.util.*;

public class Main 
{
	static boolean solve(String str) 
	{
		return str.contains("ch") || str.contains("he") || str.contains("ef");
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int count = 0;
		while (x-- > 0)
		{
			String str = s.next();
			count = (solve(str)) ? ++count : count;
		}
		System.out.println(count);
		s.close();
	}
}

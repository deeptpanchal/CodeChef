import java.util.*;

public class Main 
{
	static int solve(String n) 
	{
		int count = 0;
		for (int i = 0; i < n.length(); i++) 
		{
			if (n.charAt(i) == '4') 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String n = s.next();
			System.out.println(solve(n));
		}
		s.close();
	}
}

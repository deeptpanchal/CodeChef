import java.util.*;

public class Main 
{
	static int solve(String n) 
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n.length(); i++) 
		{
			min = Math.min(min, Integer.parseInt(n.substring(0, i) + n.substring(i + 1)));
		}
		return min;
	}

	public static void main(String[] args) 
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

import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		int count_a = 0;
		int count_b = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'a') 
			{
				count_a++;
			} 
			else 
			{
				count_b++;
			}
		}
		return Math.min(count_a, count_b);
	}

	public static void main(String[] args) 
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

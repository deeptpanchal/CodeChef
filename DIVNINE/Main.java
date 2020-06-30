import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		long sum = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			sum += str.charAt(i) - '0';
		}
		if (sum == sum % 9 && str.length() != 1)
		{
			return (int) (9 - sum % 9);
		}
		return (int) Math.min((sum % 9), 9 - (sum % 9));
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

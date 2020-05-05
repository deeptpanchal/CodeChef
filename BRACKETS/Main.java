import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		int balance = 0;
		int max_balance = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			balance = str.charAt(i) == '(' ? ++balance : --balance;
			max_balance = Math.max(max_balance, balance);
		}
		return max_balance;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			int n = solve(str);
			for (int i = 0; i < n; i++) 
			{
				System.out.print('(');
			}
			for (int i = 0; i < n; i++) 
			{
				System.out.print(')');
			}
			System.out.println();
		}
		s.close();
	}
}

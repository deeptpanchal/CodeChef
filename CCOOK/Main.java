import java.util.*;

public class Main 
{
	static String solve(int sum) 
	{
		if (sum == 0) 
		{
			return "Beginner";
		} 
		else if (sum == 1) 
		{
			return "Junior Developer";
		} 
		else if (sum == 2) 
		{
			return "Middle Developer";
		} 
		else if (sum == 3) 
		{
			return "Senior Developer";
		} 
		else if (sum == 4) 
		{
			return "Hacker";
		} 
		else 
		{
			return "Jeff Dean";
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int sum = 0;
			for (int i = 0; i < 5; i++) 
			{
				sum = sum + s.nextInt();
			}
			System.out.println(solve(sum));
		}
		s.close();
	}
}

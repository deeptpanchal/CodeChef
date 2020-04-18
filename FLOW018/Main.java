import java.util.*;

public class Main 
{
	static long solve(int n) 
	{
		long fact = 1;
		for (int i = 1; i <= n; i++) 
		{
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static int solve(int n) 
	{
		return n*(n+1)/2*(n+2)/3;
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

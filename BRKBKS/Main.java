import java.util.*;

public class Main 
{
	static int solve(int S, int W1, int W2, int W3) 
	{
		if (S >= W1 + W2 + W3) 
		{
			return 1;
		} 
		else if (S >= W1 + W2 || S >= W2 + W3) 
		{
			return 2;
		}
		return 3;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int S = s.nextInt();
			int W1 = s.nextInt();
			int W2 = s.nextInt();
			int W3 = s.nextInt();
			System.out.println(solve(S, W1, W2, W3));
		}
		s.close();
	}
}

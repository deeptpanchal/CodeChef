import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int N = s.nextInt();
			int X = s.nextInt();
			int S = s.nextInt();
			int solve = X;
			for (int i = 0; i < S; i++) 
			{
				int A = s.nextInt();
				int B = s.nextInt();
				solve = (A == solve) ? B : (B == solve) ? A : solve;
			}
			System.out.println(solve);
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static String solve(int a1, int a2, int a3, int a4, int a5, int p) 
	{
		return (a1 + a2 + a3 + a4 + a5) * p <= 120 ? "No" : "Yes";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a1 = s.nextInt();
			int a2 = s.nextInt();
			int a3 = s.nextInt();
			int a4 = s.nextInt();
			int a5 = s.nextInt();
			int p = s.nextInt();
			System.out.println(solve(a1, a2, a3, a4, a5, p));
		}
		s.close();
	}
}

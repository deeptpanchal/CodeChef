import java.util.*;

public class Main 
{
	static String solve(int p1, int p2, int k)
	{
		return (p1 + p2) / k % 2 == 0 ? "CHEF" : "COOK";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int p1 = s.nextInt();
			int p2 = s.nextInt();
			int k = s.nextInt();
			System.out.println(solve(p1, p2, k));
		}
		s.close();
	}
}

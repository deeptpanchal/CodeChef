import java.util.*;

public class Main 
{
	static String solve(int x, int y, int k) 
	{
		return (x + y) / k % 2 == 0 ? "Chef" : "Paja";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			int k = s.nextInt();
			System.out.println(solve(x, y, k));
		}
		s.close();
	}
}

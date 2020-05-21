import java.util.*;

public class Main 
{
	static String solve(int f, int d, int t, int b) 
	{
		return (double) f / b < Math.sqrt((double) 2 * (d + f) / t) ? "Bolt" : "Tiger";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int finish = s.nextInt();
			int distancetoBolt = s.nextInt();
			int tigerAccelaration = s.nextInt();
			int boltSpeed = s.nextInt();
			System.out.println(solve(finish, distancetoBolt, tigerAccelaration, boltSpeed));
		}
		s.close();
	}
}

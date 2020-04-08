import java.util.*;

public class Main 
{
	static String solve(int a, int b) 
	{
		return a % 2 == 0 || b % 2 == 0 ? "Tuzik" : "Vanka";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			System.out.println(solve(s.nextInt(), s.nextInt()));
		}
		s.close();
	}
}

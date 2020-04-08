import java.util.*;

public class Main 
{
	static String solve(int a, int b, int c) 
	{
		return (c - a) / b % 2 == 0 ? "Lucky Chef" : "Unlucky Chef";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println(solve(s.nextInt(), s.nextInt(), s.nextInt()));
		s.close();
	}
}

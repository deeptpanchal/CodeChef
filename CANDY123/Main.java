import java.util.*;

public class Main
{
	static String solve(int a, int b) 
	{
		int temp = (int) Math.sqrt(a);
		if (b >= temp * (temp + 1)) 
		{
			return "Bob";
		}
		return "Limak";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(solve(a, b));
		}
		s.close();
	}
}

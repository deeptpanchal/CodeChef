import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		StringBuffer s = new StringBuffer("");
		for (int i = 0; i < n / 2; i++)
		{
			s.append("0");
		}
		return "1 1" + s;
	}

	public static void main(String args[])
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

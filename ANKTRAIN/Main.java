import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		switch (n % 8) 
		{
			case 1:
				return n + 3 + "LB";
			case 2:
				return n + 3 + "MB";
			case 3:
				return n + 3 + "UB";
			case 4:
				return n - 3 + "LB";
			case 5:
				return n - 3 + "MB";
			case 6:
				return n - 3 + "UB";
			case 7:
				return n + 1 + "SU";
			case 0:
				return n - 1 + "SL";
			default:
				return "";
		}
	}

	public static void main(String[] args) 
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

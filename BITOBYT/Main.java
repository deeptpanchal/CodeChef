import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		n--;
		long ans = (long) Math.pow(2, n / 26);
		if (n % 26 < 2) 
		{
			return ans + " 0" + " 0";
		} 
		else if (n % 26 < 10)
		{
			return "0 " + ans + " 0";
		} 
		else 
		{
			return "0 " + "0 " + ans;
		}
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

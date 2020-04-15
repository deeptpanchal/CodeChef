import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		String ans = "";
		String add = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < n / 26; i++) 
		{
			ans += add;
		}
		ans += add.substring(0, n % 26);
		return ans;
	}

	public static void main(String arga[]) 
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

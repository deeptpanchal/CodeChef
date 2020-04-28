import java.util.*;

public class Main 
{
	static String solve(String str, int n) 
	{
		for (int i = 0; i < n - 1; i++) 
		{
			if (str.charAt(i) == '1') 
			{
				int next = str.indexOf("1", i + 1);
				if (next != -1 && next - i < 6) 
				{
					return "NO";
				}
			}
		}
		return "YES";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			s.nextLine();
			String str = s.nextLine();
			System.out.println(solve(str.replaceAll(" ", ""), n));
		}
		s.close();
	}
}

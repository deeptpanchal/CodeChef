import java.util.*;

public class Main 
{
	static String[] solve(String[] str, int n) 
	{
		String ans[] = new String[n];
		ans[0] = "Begin " + str[n - 1].split(" ", 2)[1];
		for (int i = 1; i < n; i++) 
		{
			ans[i] = (str[n - i].split(" ")[0].equals("Left") ? "Right " : "Left ") + str[n - 1 - i].split(" ", 2)[1];
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			s.nextLine();
			String str[] = new String[n];
			for (int i = 0; i < n; i++) 
			{
				str[i] = s.nextLine();
			}
			String ans[] = solve(str, n);
			for (int i = 0; i < n; i++) 
			{
				System.out.println(ans[i]);
			}
		}
		s.close();
	}
}

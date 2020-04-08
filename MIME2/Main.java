import java.util.*;

public class Main 
{
	static String solve(String a[][], String temp) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			if (temp.endsWith("." + a[i][0])) 
			{
				return a[i][1];
			}
		}
		return "unknown";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		String a[][] = new String[n][2];
		for (int i = 0; i < n; i++) 
		{
			a[i][0] = s.next();
			a[i][1] = s.next();
		}
		for (int i = 0; i < q; i++) 
		{
			System.out.println(solve(a, s.next()));
		}
		s.close();
	}
}

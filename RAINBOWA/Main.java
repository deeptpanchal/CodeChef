import java.util.*;
import java.util.regex.Pattern;

public class Main 
{
	static String solve(String a, int n) 
	{
		Pattern p = Pattern.compile("[1]+[2]+[3]+[4]+[5]+[6]+[7]+");
		if (p.matcher(a.substring(0, (n - 1) / 2 + 1)).matches()) 
		{
			StringBuilder rev = new StringBuilder(a);
			rev.reverse();
			if (a.equals(rev.toString())) 
			{
				return "yes";
			}
		}
		return "no";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			char a[] = new char[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.next().toCharArray()[0];
			}
			System.out.println(solve(String.valueOf(a), n));
		}
		s.close();
	}
}

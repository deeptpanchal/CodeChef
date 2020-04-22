import java.util.*;

public class Main 
{
	static String solve(String str, int l) 
	{
		str = str.replaceAll("\\.", "").replaceAll("HT", "");
		return str.equals("") ? "Valid" : "Invalid";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int l = s.nextInt();
			String str = s.next();
			System.out.println(solve(str, l));
		}
		s.close();
	}
}

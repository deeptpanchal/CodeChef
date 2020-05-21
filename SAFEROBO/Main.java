import java.util.*;

public class Main 
{
	static String solve(String str, int sa, int sb) 
	{
		int A = str.indexOf("A");
		int B = str.indexOf("B");
		return (B - A) % (sa + sb) == 0 ? "unsafe" : "safe";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			int sa = s.nextInt();
			int sb = s.nextInt();
			System.out.println(solve(str, sa, sb));
		}
		s.close();
	}
}

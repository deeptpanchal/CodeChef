import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		return (n > 1000) ? "More than 3 digits" : String.valueOf(n).length() + "";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solve(n));
		s.close();
	}
}

import java.util.*;

public class Main
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n = s.nextLong();
			long k = s.nextLong();
			System.out.println(n / k % k == 0 ? "NO" : "YES");
		}
		s.close();
	}
}

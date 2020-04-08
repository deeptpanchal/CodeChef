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
			System.out.println(n * (n + 3) / 2);
		}
		s.close();
	}
}

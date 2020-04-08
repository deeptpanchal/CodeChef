import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(n / 100 + n % 100 / 50 + n % 100 % 50 / 10 + n % 100 % 50 % 10 / 5
					+ n % 100 % 50 % 10 % 5 / 2 + n % 100 % 50 % 10 % 5 % 2 / 1);
		}
		s.close();
	}
}

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
			System.out.println(n % 10 + (String.valueOf(n).charAt(0) - '0'));
		}
		s.close();
	}
}

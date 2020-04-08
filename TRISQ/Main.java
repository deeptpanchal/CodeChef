import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt() / 2;
			System.out.println(n * (n - 1) / 2);
		}
		s.close();
	}
}

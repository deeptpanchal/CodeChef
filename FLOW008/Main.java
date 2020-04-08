import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			if (s.nextInt() < 10) 
			{
				System.out.println("What an obedient servant you are!");
			} 
			else 
			{
				System.out.println("-1");
			}
		}
		s.close();
	}
}

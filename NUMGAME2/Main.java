import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			if (n % 4 == 1) 
			{
				System.out.println("ALICE");
			} 
			else 
			{
				System.out.println("BOB");
			}
		}
		s.close();
	}
}

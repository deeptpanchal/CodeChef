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
			if (360 % n == 0) 
			{
				System.out.print("y ");
			} 
			else 
			{
				System.out.print("n ");
			}
			if (n <= 360) 
			{
				System.out.print("y ");
			} 
			else 
			{
				System.out.print("n ");
			}
			if (n <= 26) 
			{
				System.out.print("y\n");
			} 
			else 
			{
				System.out.print("n\n");
			}
		}
		s.close();
	}
}

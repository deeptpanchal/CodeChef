import java.util.*;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			if (a > b) 
			{
				System.out.println(">");
			} 
			else if (a < b) 
			{
				System.out.println("<");
			} 
			else 
			{
				System.out.println("=");
			}
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			String str = s.next();
			if (str.contains("010") || str.contains("101")) 
			{
				System.out.println("Good");
			} 
			else 
			{
				System.out.println("Bad");
			}
		}
		s.close();
	}
}

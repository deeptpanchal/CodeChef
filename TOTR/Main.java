import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String str = s.next();
		while (x-- > 0) 
		{
			String ans = s.next();
			for (int i = 0; i < ans.length(); i++) 
			{
				if (ans.charAt(i) == '_') 
				{
					System.out.print(' ');
				} 
				else if (ans.charAt(i) == '.' || ans.charAt(i) == ',' || ans.charAt(i) == '!' || ans.charAt(i) == '?') 
				{
					System.out.print(ans.charAt(i));
				} 
				else if (ans.charAt(i) <= 'Z') 
				{
					System.out.print((str.charAt(ans.toLowerCase().charAt(i) - 'a') + "").toUpperCase());
				} 
				else 
				{
					System.out.print(str.charAt(ans.charAt(i) - 'a'));
				}
			}
			System.out.println();
		}
		s.close();
	}
}

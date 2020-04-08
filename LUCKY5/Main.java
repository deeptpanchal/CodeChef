import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			int count = 0;
			for (int i = 0; i < str.length(); i++) 
			{
				if (str.charAt(i) != '4' && str.charAt(i) != '7') 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}

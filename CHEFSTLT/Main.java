import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String s1 = s.next();
			String s2 = s.next();
			int min = 0;
			int max = 0;
			for (int i = 0; i < s1.length(); i++) 
			{
				if (s1.charAt(i) != s2.charAt(i) || (s1.charAt(i) == '?' && s2.charAt(i) == '?')) 
				{
					max++;
					if (s1.charAt(i) != '?' && s2.charAt(i) != '?') 
					{
						min++;
					}
				}
			}
			System.out.println(min + " " + max);
		}
		s.close();
	}
}

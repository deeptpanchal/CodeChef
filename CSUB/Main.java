import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int len = s.nextInt();
			String str = s.next();
			long n = 0;
			for (int i = 0; i < len; i++) 
			{
				if (str.charAt(i) == '1') 
				{
					n++;
				}
			}
			System.out.println(n * (n + 1) / 2);
		}
		s.close();
	}
}

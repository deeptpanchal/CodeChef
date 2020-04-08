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
			int temp = 0;
			int ans = 0;
			for (int i = 0; i < str.length(); i++) 
			{
				if (str.charAt(i) == '<') 
				{
					temp++;
				} 
				else 
				{
					temp--;
					if (temp == 0) 
					{
						ans = i + 1;
					} 
					else if (temp < 0) 
					{
						break;
					}
				}
			}
			System.out.println(ans);
		}
		s.close();
	}
}

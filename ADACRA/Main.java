import java.util.*;

public class Main 
{
	static int solve(String str) 
	{
		str = str.replaceAll("[U]+", "U").replaceAll("[D]+", "D");
		int count_u = 0;
		int count_d = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'U') 
			{
				count_u++;
			} 
			else 
			{
				count_d++;
			}
		}
		return Math.min(count_u, count_d);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			System.out.println(solve(str));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			String str = "415926530119026040722614947737296840070086399613316";
			String ans = "3";
			if (n == 0) 
			{
				System.out.println(ans);
			} 
			else 
			{
				ans += ".1";
				System.out.print(ans);
				for (int i = 0; i < (n - 1) / 51; i++) 
				{
					System.out.print(str);
				}
				for (int i = 1; i <= (n - 1) % 51; i++) 
				{
					System.out.print(str.charAt(i - 1));
				}
			}
			System.out.println();
		}
		s.close();
	}
}

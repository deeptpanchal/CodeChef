import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			char[] ch = s.next().toCharArray();
			int sum = 0;
			for (int i = 0; i < ch.length - 1; i++) 
			{
				if (ch[i] <= ch[i + 1]) 
				{
					sum = sum + (int) (ch[i + 1] - ch[i]);
				} 
				else 
				{
					sum = sum + (int) (ch[i + 1] - ch[i] + 26);
				}
			}
			sum = sum + ch.length + 1;
			if (sum <= 11 * ch.length) 
			{
				System.out.println("YES");
			} 
			else 
			{
				System.out.println("NO");
			}
		}
		s.close();
	}
}

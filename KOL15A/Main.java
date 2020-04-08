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
			for (int i = 0; i < ch.length; i++) 
			{
				if (ch[i] >= '0' && ch[i] <= '9') 
				{
					sum = sum + Integer.parseInt(ch[i] + "");
				}
			}
			System.out.println(sum);
		}
		s.close();
	}
}

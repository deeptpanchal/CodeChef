import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			StringBuffer sb = new StringBuffer(str);
			if (str.equals(String.valueOf(sb.reverse()))) 
			{
				System.out.println("wins");
			} 
			else 
			{
				System.out.println("losses");
			}
		}
		s.close();
	}
}

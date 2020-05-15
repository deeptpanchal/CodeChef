import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int min = s.next().equals("INDIAN") ? 200 : 400;
			int total = 0;
			for (int i = 0; i < n; i++) 
			{
				String temp = s.next();
				if (temp.equals("CONTEST_WON")) 
				{
					int rank = s.nextInt();
					total = total + 300 + Math.max(20 - rank, 0);
				} 
				else if (temp.equals("TOP_CONTRIBUTOR"))
				{
					total = total + 300;
				} 
				else if (temp.equals("BUG_FOUND")) 
				{
					int severity = s.nextInt();
					total = total + severity;
				} 
				else if (temp.equals("CONTEST_HOSTED"))
				{
					total = total + 50;
				}
			}
			System.out.println(total / min);
		}
		s.close();
	}
}

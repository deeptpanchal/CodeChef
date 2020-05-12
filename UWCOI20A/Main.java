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
			int max = 0;
			for (int i = 0; i < n; i++)
			{
				max = Math.max(max, s.nextInt());
			}
			System.out.println(max);
		}
		s.close();
	}
}

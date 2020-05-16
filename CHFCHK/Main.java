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
			int min = 100000;
			for (int i = 0; i < n; i++) 
			{
				min = Math.min(min, s.nextInt());
			}
			System.out.println(min);
		}
		s.close();
	}
}

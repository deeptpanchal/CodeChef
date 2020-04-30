import java.util.*;

public class Main
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int count = 0;
			for (int i = 0; i < 10; i++) 
			{
				for (int j = 0; j < 10; j++) 
				{
					if (s.nextInt() <= 30) 
					{
						count++;
					}
				}
			}
			System.out.println(count >= 60 ? "yes" : "no");
		}
		s.close();
	}
}

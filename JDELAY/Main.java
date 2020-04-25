import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) 
			{
				int S = s.nextInt();
				int J = s.nextInt();
				if (J - S > 5) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}

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
			long count_2 = 0;
			long count_3 = 0;
			for (int i = 0; i < n; i++) 
			{
				int temp = s.nextInt();
				if (temp == 2) 
				{
					count_2++;
				}
				if (temp >= 3) 
				{
					count_3++;
				}
			}
			System.out.println(count_3 * (count_3 - 1) / 2 + count_3 * count_2);
		}
		s.close();
	}
}

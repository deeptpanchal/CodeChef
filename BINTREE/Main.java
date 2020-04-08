import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int i = s.nextInt();
			int j = s.nextInt();
			int count = 0;
			while (i != j) 
			{
				if (i > j) 
				{
					i = i / 2;
				} 
				else 
				{
					j = j / 2;
				}
				count++;
			}
			System.out.println(count);
		}
		s.close();
	}
}

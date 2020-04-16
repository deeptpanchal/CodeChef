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
			int b = 0;
			for (int i = n; i > 0; i = i / 10) 
			{
				b = b * 10 + i % 10;
			}
			System.out.println(b);
		}
		s.close();
	}
}

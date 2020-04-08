import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int count = 0;
		while (x-- > 0) 
		{
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			double d12 = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
			double d23 = Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2);
			double d31 = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
			if (d12 == d23 + d31 || d23 == d31 + d12 || d31 == d12 + d23) 
			{
				count++;
			}
		}
		System.out.println(count);
		s.close();
	}
}

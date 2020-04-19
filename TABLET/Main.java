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
			int b = s.nextInt();
			int area = 0;
			for (int i = 0; i < n; i++) 
			{
				int w = s.nextInt();
				int h = s.nextInt();
				int p = s.nextInt();
				if (p <= b) 
				{
					area = Math.max(area, w * h);
				}
			}
			if (area == 0) 
			{
				System.out.println("no tablet");
			} 
			else 
			{
				System.out.println(area);
			}
		}
		s.close();
	}
}

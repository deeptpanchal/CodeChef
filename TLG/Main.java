import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int team = 1;
		int a = 0, b = 0, max = 0;
		while (x-- > 0) 
		{
			a = s.nextInt();
			b = s.nextInt();
			if (a > b && max < a - b) 
			{
				team = 1;
				max = a - b;
			}
			if (b > a && max < b - a) 
			{
				team = 2;
				max = b - a;
			}
		}
		System.out.println(team + " " + max);
		s.close();
	}
}

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (a + b + c != 180) 
			{
				System.out.println("NO");
			} 
			else 
			{
				System.out.println("YES");
			}
		}
		s.close();
	}
}

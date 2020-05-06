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
			int ans = 0;
			for (int i = 0; i < n; i++) 
			{
				ans = ans | s.nextInt();
			}
			System.out.println(ans);
		}
		s.close();
	}
}

import java.util.*;

public class Main
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int n = s.nextInt();
			int k = s.nextInt();
			long r = 0;
			for (int i = 0; i < n; i++) 
			{
				r = r + s.nextInt();
			}
			System.out.println(r % k);
		}
		s.close();
	}
}

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
			String LIS = "";
			for (int i = 0; i < n; i++) 
			{
				LIS = LIS + s.next();
			}
			System.out.println(LIS);
		}
		s.close();
	}
}

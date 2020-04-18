import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		boolean t[] = new boolean[n];
		for (int i = 0; i < k; i++) 
		{
			String str = s.next();
			if (str.equals("CLICK")) 
			{
				int temp = s.nextInt();
				t[temp - 1] = (t[temp - 1] == false) ? true : false;
			}
			if (str.equals("CLOSEALL")) 
			{
				Arrays.fill(t, false);
			}
			int count = 0;
			for (int j = 0; j < n; j++) 
			{
				if (t[j]) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}

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
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) 
			{
				a.add(s.nextInt());
			}
			Collections.sort(a, Collections.reverseOrder());
			int ans = 0;
			for (int i = 0; i < n; i++) 
			{
				if (i % 4 == 0 || i % 4 == 1) 
				{
					ans = ans + a.get(i);
				}
			}
			System.out.println(ans);
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			String str[] = new String[n];
			for (int i = 0; i < n; i++) 
			{
				str[i] = s.next();
			}
			HashSet<String> hs = new HashSet();
			for (int i = 0; i < k; i++) 
			{
				int l = s.nextInt();
				for (int j = 0; j < l; j++) 
				{
					hs.add(s.next());
				}
			}
			for (int i = 0; i < n; i++)
			{
				System.out.print(hs.contains(str[i]) ? "YES " : "NO ");
			}
			System.out.println();
		}
		s.close();
	}
}

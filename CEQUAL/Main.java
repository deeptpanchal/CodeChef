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
			Set<Integer> a = new HashSet<>();
			for (int i = 0; i < n; i++) 
			{
				a.add(s.nextInt());
			}
			if (a.size() != n) 
			{
				System.out.println("Yes");
			} 
			else 
			{
				System.out.println("No");
			}
		}
		s.close();
	}
}

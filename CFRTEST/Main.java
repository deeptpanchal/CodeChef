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
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < n; i++) 
			{
				set.add(s.nextInt());
			}
			System.out.println(set.size());
		}
		s.close();
	}
}

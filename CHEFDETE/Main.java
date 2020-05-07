import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < n; i++) 
		{
			hs.add(s.nextInt());
		}
		for (int i = 0; i <= n; i++) 
		{
			if (!hs.contains(i)) 
			{
				System.out.print(i + " ");
			}
		}
		s.close();
	}
}

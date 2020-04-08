import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			HashSet<Integer> hs = new HashSet<>();
			for (int i = 0; i < n; i++) 
			{
				hs.add(s.nextInt());
			}
			System.out.println(hs.size());
		}
		s.close();
	}
}

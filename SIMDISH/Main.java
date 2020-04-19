import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			HashSet<String> hs = new HashSet<>();
			for (int i = 0; i < 4; i++) 
			{
				hs.add(s.next());
			}
			int count = 0;
			for (int i = 0; i < 4; i++) 
			{
				if (hs.contains(s.next())) 
				{
					count++;
				}
			}
			if (count >= 2) 
			{
				System.out.println("similar");
			} 
			else 
			{
				System.out.println("dissimilar");
			}
		}
		s.close();
	}
}

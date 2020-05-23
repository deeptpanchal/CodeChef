import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int tr = s.nextInt();
			boolean Tr[] = new boolean[100];
			for (int i = 0; i < tr; i++) 
			{
				Tr[s.nextInt() - 1] = true;
			}
			int dr = s.nextInt();
			boolean Dr[] = new boolean[100];
			for (int i = 0; i < dr; i++)
			{
				Dr[s.nextInt() - 1] = true;
			}
			boolean flag = true;
			int ts = s.nextInt();
			for (int i = 0; i < ts; i++) 
			{
				if (!Tr[s.nextInt() - 1])
				{
					flag = false;
				}
			}
			int ds = s.nextInt();
			for (int i = 0; i < ds; i++) 
			{
				if (!Dr[s.nextInt() - 1]) 
				{
					flag = false;
				}
			}
			System.out.println(flag ? "yes" : "no");
		}
		s.close();
	}
}

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
			boolean q[] = new boolean[5];
			for (int i = 0; i < n; i++)
			{
				String str = s.next();
				switch (str)
				{
					case "cakewalk":
						q[0] = true;
						break;
					case "simple":
						q[1] = true;
						break;
					case "easy":
						q[2] = true;
						break;
					case "easy-medium":
					case "medium":
						q[3] = true;
						break;
					case "medium-hard":
					case "hard":
						q[4] = true;
						break;
				}
			}
			System.out.println(q[0] && q[1] && q[2] && q[3] && q[4] ? "Yes" : "No");
		}
		s.close();
	}
}

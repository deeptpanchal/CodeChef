import java.util.*;

public class Main 
{
	static String solve(char a[][]) 
	{
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				if (a[i][j] == 'l' && a[i + 1][j] == 'l' && a[i + 1][j + 1] == 'l') 
				{
					return "yes";
				}
			}
		}
		return "no";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			char a[][] = new char[3][3];
			for (int i = 0; i < 3; i++) 
			{
				a[i] = s.next().toCharArray();
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}

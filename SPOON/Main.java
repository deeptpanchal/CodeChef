import java.util.*;

public class Main 
{
	static String ans(char m[][], int r, int c) 
	{
		if (r < 5 && c < 5) 
		{
			return "There is indeed no spoon!";
		}
		if (c >= 5) 
		{
			for (int i = 0; i < r; i++) 
			{
				if (String.valueOf(m[i]).toLowerCase().contains("spoon")) 
				{
					return "There is a spoon!";
				}
			}
		}
		if (r >= 5) 
		{
			for (int i = 0; i < c; i++) 
			{
				String temp = "";
				for (int j = 0; j < r; j++) 
				{
					temp = temp + m[j][i];
				}
				if (String.valueOf(temp).toLowerCase().contains("spoon")) 
				{
					return "There is a spoon!";
				}
			}
		}
		return "There is indeed no spoon!";
	}

	public static void main(String ags[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int r = s.nextInt();
			int c = s.nextInt();
			char m[][] = new char[r][c];
			for (int i = 0; i < r; i++) 
			{
				m[i] = s.next().toCharArray();
			}
			System.out.println(ans(m, r, c));
		}
		s.close();
	}
}

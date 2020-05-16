import java.util.*;

public class Main
{
	static String solve(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++)
		{
			char ch[] = str.substring(i, i + 4).toCharArray();
			Arrays.sort(ch);
			if (String.valueOf(ch).equals("cefh"))
			{
				count++;
			}
		}
		return count == 0 ? "normal" : "lovely " + count;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			System.out.println(solve(str));
		}
		s.close();
	}
}

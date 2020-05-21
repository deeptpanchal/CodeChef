import java.util.*;
import java.util.regex.Pattern;

public class Main 
{
	static int time(String str)
	{
		int time = 2;
		for (int i = 1; i < str.length(); i++) 
		{
			if (Pattern.matches("[df][df]|[jk][jk]", str.substring(i - 1, i + 1)))
			{
				time = time + 4;
			} 
			else
			{
				time = time + 2;
			}
		}
		return time;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			HashMap<String, Integer> h = new HashMap<>();
			int time = 0;
			for (int i = 0; i < n; i++)
			{
				String word = s.next();
				if (h.containsKey(word)) 
				{
					time = time + h.get(word) / 2;
				} 
				else
				{
					h.put(word, time(word));
					time = time + h.get(word);
				}
			}
			System.out.println(time);
		}
		s.close();
	}
}

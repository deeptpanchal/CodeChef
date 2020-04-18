import java.util.*;

public class Main 
{
	static String solve(String str, int n) 
	{
		if (n % 2 == 0) 
		{
			HashMap<Character, Integer> hm = new HashMap<>();
			for (int i = 0; i < n; i++) 
			{
				char temp = str.charAt(i);
				hm.put(temp, hm.getOrDefault(temp, 0) + 1);
			}
			for (Integer i : hm.values()) 
			{
				if (i == n / 2) 
				{
					return "YES";
				}
			}
		}
		return "NO";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			System.out.println(solve(str, str.length()));
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static boolean check(ArrayList<Integer> l, ArrayList<Integer> g, int n) 
	{
		for (int i = 0; i < n; i++) 
		{
			if (l.get(i) > g.get(i)) 
			{
				return false;
			}
		}
		return true;
	}

	static String solve(ArrayList<Integer> l, ArrayList<Integer> g, int n) 
	{
		boolean bool1 = check(l, g, n);
		Collections.reverse(l);
		boolean bool2 = check(l, g, n);
		if (bool1) 
		{
			return bool2 ? "both" : "front";
		}
		return bool2 ? "back" : "none";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			ArrayList<Integer> l = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				l.add(s.nextInt());
			}
			ArrayList<Integer> g = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				g.add(s.nextInt());
			}
			System.out.println(solve(l, g, n));
		}
		s.close();
	}
}

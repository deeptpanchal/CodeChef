import java.util.*;

public class Main
{
	static boolean check_fibo(ArrayList<Integer> n)
	{
		for (int i = 2; i < n.size(); i++)
		{
			if (n.get(i) != n.get(i - 1) + n.get(i - 2)) 
			{
				return false;
			}
		}
		return true;
	}

	static String solve(String str) 
	{
		HashMap<Character, Integer> a = new HashMap<>();
		for (int i = 0; i < str.length(); i++) 
		{
			a.put(str.charAt(i), a.getOrDefault(str.charAt(i), 0) + 1);
		}
		if (a.size() < 3) 
		{
			return "Dynamic";
		}
		ArrayList<Integer> n1 = new ArrayList<>(a.values());
		Collections.sort(n1);
		ArrayList<Integer> n2 = new ArrayList<>(n1);
		n2.set(0, n1.get(1));
		n2.set(1, n1.get(0));
		return check_fibo(n1) || check_fibo(n2) ? "Dynamic" : "Not";
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

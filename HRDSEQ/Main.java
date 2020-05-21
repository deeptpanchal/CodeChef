import java.util.*;

public class Main 
{
	static ArrayList<Integer> a = new ArrayList<>();

	static void solve() 
	{
		a.add(0);
		for (int i = 1; i <= 128; i++) 
		{
			int index = a.subList(0, i - 1).lastIndexOf(a.get(i - 1));
			if (index >= 0) 
			{
				a.add(i - index - 1);
			} else {
				a.add(0);
			}
		}
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		solve();
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(Collections.frequency(a.subList(0, n), a.get(n - 1)));
		}
		s.close();
	}
}

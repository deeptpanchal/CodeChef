import java.util.*;

public class Main
{
	static String solve(ArrayList<Integer> a) 
	{
		int min = Collections.min(a);
		int max = Collections.max(a);
		return a.indexOf(min) < a.indexOf(max) ? String.valueOf(min + " " + max) : String.valueOf(max + " " + min);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				a.add(s.nextInt());
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}

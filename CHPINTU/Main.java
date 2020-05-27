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
			int m = s.nextInt();
			HashMap<Integer, Integer> h = new HashMap<>();
			int f[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				f[i] = s.nextInt();
				h.put(f[i], 0);
			}
			for (int i = 0; i < n; i++) 
			{
				int p = s.nextInt();
				h.put(f[i], h.get(f[i]) + p);
			}
			System.out.println(Collections.min(h.values()));
		}
		s.close();
	}
}

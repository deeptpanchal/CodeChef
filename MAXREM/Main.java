import java.util.*;

public class Main 
{
	static int solve(HashSet<Integer> a) 
	{
		int size = a.size();
		if (size == 1) 
		{
			return 0;
		}
		int b[] = a.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(b);
		return b[size - 2];
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashSet<Integer> a = new HashSet<Integer>();
		for (int i = 0; i < n; i++) 
		{
			a.add(s.nextInt());
		}
		System.out.println(solve(a));
		s.close();
	}
}

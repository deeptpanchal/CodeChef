import java.util.*;

public class Main 
{
	static int solve(String[] str) 
	{
		int len = str.length;
		int a[] = new int[len];
		for (int i = 0; i < len; i++) 
		{
			a[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(a);
		return a[len - 1] == len - 1 ? a[len - 2] : a[len - 1];
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.nextLine();
		while (x-- > 0) 
		{
			String str = s.nextLine();
			System.out.println(solve(str.split(" ")));
		}
		s.close();
	}
}

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++) 
			{
				sum += s.nextInt();
			}
			System.out.println(sum % 2 == 1 ? "YES" : "NO");
		}
		s.close();
	}
}

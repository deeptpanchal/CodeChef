import java.time.*;
import java.util.*;

public class Main 
{
	static String solve(int n) 
	{
		return LocalDate.of(n, 1, 1).getDayOfWeek().toString().toLowerCase();
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}

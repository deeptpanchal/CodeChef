import java.util.*;

public class Main 
{
	static String solve(String str[]) 
	{
		int len = str.length;
		str[len - 1] = str[len - 1].substring(0, 1).toUpperCase() + str[len - 1].substring(1).toLowerCase();
		for (int i = 0; i < len - 1; i++) 
		{
			str[i] = str[i].substring(0, 1).toUpperCase() + ".";
		}
		return String.join(" ", str);
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

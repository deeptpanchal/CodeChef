import java.util.*;

public class Main 
{
	static String solve(String str) 
	{
		return str.contains("1 1 1 1 1 1") ? "#coderlifematters" : "#allcodersarefun";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.nextLine();
		while (x-- > 0) 
		{
			String str = s.nextLine();
			System.out.println(solve(str));
		}
		s.close();
	}
}

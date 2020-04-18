import java.util.*;

public class Main 
{
	static String solve(char c) 
	{
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') 
		{
			return "Vowel";
		}
		return "Consonant";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(solve(str.toCharArray()[0]));
		s.close();
	}
}

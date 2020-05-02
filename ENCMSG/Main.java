import java.util.*;

public class Main 
{
	static String solve(char ch[], int n) 
	{
		for (int i = 0; i < n - 1; i = i + 2) 
		{
			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}
		for (int i = 0; i < n; i++) 
		{
			ch[i] = (char) (122 - (ch[i] - 'a'));
		}
		return String.valueOf(ch);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			char ch[] = s.next().toCharArray();
			System.out.println(solve(ch, n));
		}
		s.close();
	}
}

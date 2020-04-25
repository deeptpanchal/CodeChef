import java.util.*;

public class Main 
{
	static String solve(char S[], char R[]) 
	{
		Arrays.sort(S);
		Arrays.sort(R);
		return Arrays.equals(S, R) ? "YES" : "NO";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			char S[] = s.next().toCharArray();
			char R[] = s.next().toCharArray();
			System.out.println(solve(S, R));
		}
		s.close();
	}
}

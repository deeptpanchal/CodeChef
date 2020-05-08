import java.util.*;

public class Main 
{
	static int solve(char S[], char U[], int n) 
	{	
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			if (U[i] != 'N')
			{
				if (S[i] == U[i]) 
				{
					count++;
				} 
				else 
				{
					i++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			String S = s.next();
			String U = s.next();
			System.out.println(solve(S.toCharArray(), U.toCharArray(), n));
		}
		s.close();
	}
}

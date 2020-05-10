import java.util.*;

public class Main 
{
	static String solve(int P[], int Player[], int N, int S) 
	{
		int min0 = 100;
		int min1 = 100;
		for (int i = 0; i < N; i++) 
		{
			if (Player[i] == 0) 
			{
				min0 = Math.min(min0, P[i]);
			} 
			else 
			{
				min1 = Math.min(min1, P[i]);
			}
		}
		return S + min0 + min1 <= 100 ? "yes" : "no";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int N = s.nextInt();
			int S = s.nextInt();
			int P[] = new int[N];
			int Player[] = new int[N];
			for (int i = 0; i < N; i++)
			{
				P[i] = s.nextInt();
			}
			for (int i = 0; i < N; i++)
			{
				Player[i] = s.nextInt();
			}
			System.out.println(solve(P, Player, N, S));
		}
		s.close();
	}
}

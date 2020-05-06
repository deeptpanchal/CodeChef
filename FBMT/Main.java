import java.util.*;

public class Main 
{
	static String solve(HashMap<String, Integer> score, int n) 
	{
		for (String team : score.keySet()) 
		{
			if (score.get(team) * 2 > n) 
			{
				return team;
			}
		}
		return "Draw";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			HashMap<String, Integer> score = new HashMap<>();
			for (int i = 0; i < n; i++) 
			{
				String team = s.next();
				score.put(team, score.getOrDefault(team, 0) + 1);
			}
			System.out.println(solve(score, n));
		}
		s.close();
	}
}

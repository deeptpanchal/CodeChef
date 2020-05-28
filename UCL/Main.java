import java.util.*;

public class Main 
{
	public static String solve(HashMap<String, int[]> h) 
	{
		String team = h.keySet().iterator().next();
		int a[] = h.get(team);
		for (String w : h.keySet()) 
		{
			int b[] = h.get(w);
			if ((b[0] > a[0]) || (b[0] == a[0] && b[1] > a[1]))
			{
				team = w;
				a = b;
			}
		}
		return team;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			HashMap<String, int[]> h = new HashMap<>();
			for (int i = 0; i < 12; i++) 
			{
				String teamA = s.next();
				int goalA = s.nextInt();
				s.next();
				int goalB = s.nextInt();
				String teamB = s.next();
				int scoreA = goalA > goalB ? 3 : goalA < goalB ? 0 : 1;
				int scoreB = goalA > goalB ? 0 : goalA < goalB ? 3 : 1;
				int A[] = h.getOrDefault(teamA, new int[] { 0, 0 });
				A[0] = A[0] + scoreA;
				A[1] = A[1] + goalA - goalB;
				h.put(teamA, A);
				int B[] = h.getOrDefault(teamB, new int[] { 0, 0 });
				B[0] = B[0] + scoreB;
				B[1] = B[1] + goalB - goalA;
				h.put(teamB, B);
			}
			String team1 = solve(h);
			h.remove(team1);
			String team2 = solve(h);
			System.out.println(team1 + " " + team2);
		}
		s.close();
	}
}

import java.util.*;

public class Main 
{
	static ArrayList<String> solve(ArrayList<String> fname, ArrayList<String> lname, int n) 
	{
		ArrayList<String> name = new ArrayList<>();
		for (int i = 0; i < n; i++) 
		{
			name.add(fname.get(i) + (Collections.frequency(fname, fname.get(i)) > 1 ? " " + lname.get(i) : ""));
		}
		return name;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			ArrayList<String> fname = new ArrayList<>();
			ArrayList<String> lname = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				fname.add(s.next());
				lname.add(s.next());
			}
			for (String name : solve(fname, lname, n)) 
			{
				System.out.println(name);
			}
		}
		s.close();
	}
}

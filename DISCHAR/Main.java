import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			char[] ch = s.next().toCharArray();
			HashSet<String> hs = new HashSet<>();
			for (int i = 0; i < ch.length; i++) 
			{
				hs.add(ch[i] + "");
			}
			System.out.println(hs.size());
		}
		s.close();
	}
}

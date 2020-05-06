import java.util.*;

public class Main 
{
	static String solve(char X[], char Y[]) 
	{
		int len = X.length;
		char Z[] = new char[len];
		for (int i = 0; i < len; i++) 
		{
			Z[i] = X[i] == 'B' && Y[i] == 'B' ? 'W' : 'B';
		}
		return String.valueOf(Z);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String X = s.next();
			String Y = s.next();
			System.out.println(solve(X.toCharArray(), Y.toCharArray()));
		}
		s.close();
	}
}

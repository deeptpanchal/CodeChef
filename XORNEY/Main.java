import java.io.*;

public class Main 
{
	static String solve(long l, long r) 
	{
		return ((r - l) / 2 + (l % 2 == 0 && r % 2 == 0 ? 0 : 1)) % 2 == 0 ? "Even" : "Odd";
	}

	public static void main(String args[]) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		while (x-- > 0) 
		{
			String[] input = br.readLine().split(" ");
			long l = Long.parseLong(input[0]);
			long r = Long.parseLong(input[1]);
			out.write(solve(l, r));
			out.newLine();
		}
		br.close();
		out.flush();
		out.close();
	}
}

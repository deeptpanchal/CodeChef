import java.io.*;
import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		InputStream inputStream = System.in;
		InputReader in = new InputReader(inputStream);
		int n = in.nextInt();
		int k = in.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) 
		{
			int x = in.nextInt();
			if (x % k == 0) 
			{
				ans++;
			}
		}
		System.out.println(ans);
	}

	static class InputReader 
	{
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) 
		{
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() 
		{
			while (tokenizer == null || !tokenizer.hasMoreTokens()) 
			{
				try 
				{
					tokenizer = new StringTokenizer(reader.readLine());
				} 
				catch (IOException e) 
				{
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() 
		{
			return Integer.parseInt(next());
		}
	}
}

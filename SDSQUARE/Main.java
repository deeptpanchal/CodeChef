import java.util.*;

public class Main 
{
	static ArrayList<Long> arr = new ArrayList<>();

	static void set() 
	{
		for (long i = 1; i <= 100000; i++) 
		{
			String str = String.valueOf(i * i);
			if (!(str.contains("2") || str.contains("3") || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8"))) 
			{
				arr.add(Long.parseLong(str));
			}
		}
	}

	static int solve(long n, long m) 
	{
		int start_index = Collections.binarySearch(arr, n);
		int end_index = Collections.binarySearch(arr, m);
		if (start_index < 0) 
		{
			start_index = -1 - start_index;
		}
		if (end_index < 0) 
		{
			end_index = -1 - end_index - 1;
		}
		return end_index - start_index + 1;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		set();
		int O = s.nextInt();
		while (O-- > 0) 
		{
			long n = s.nextLong();
			long m = s.nextLong();
			System.out.println(solve(n, m));
		}
		s.close();
	}
}

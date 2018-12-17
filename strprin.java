import java.util.*;
import java.io.*;
class strprin
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println(str);
		}
	}
}

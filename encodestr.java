import java.util.*;
import java.io.*;
class encodestr
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringBuilder s = new StringBuilder();
		int l = str.length();
		for(int i = 0 ; i < l ; i++ )
		{
			s.append((char)(str.charAt(i)+3));
		}
		System.out.print(s);
	}
}	

import java.util.*;
import java.io.*;
class spch
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String str = " ";
		int charCount = s.length() - s.replaceAll("\\.", "").length();
		
		System.out.println(charCount);
	}
}

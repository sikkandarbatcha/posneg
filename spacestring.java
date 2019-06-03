import java.util.*;
import java.io.*;
class spacestring
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int len = str.length();
		String s ="";
		s=str.replaceAll(" ","");
		System.out.print(s);
	}
}	

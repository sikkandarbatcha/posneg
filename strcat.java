import java.util.*;
import java.io.*;
class strcat
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String st = bf.readLine();
		String s = " ";
		s = str + st;
		System.out.println(s);
	}
}	

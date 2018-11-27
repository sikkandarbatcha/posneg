import java.util.*;
import java.io.*;
class stringcount
{	
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String s = str.replaceAll(" ","");
		System.out.println(+s.length());
	}
}	

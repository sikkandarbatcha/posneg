import java.util.*;
import java.io.*;
class strnumber
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		str=str.replaceAll("['a-zA-Z']","");
		System.out.print(str);
	}
}	

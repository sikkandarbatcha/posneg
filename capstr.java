import java.util.*;
import java.io.*;
class capstr
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int len = str.length();
		String s = ""; String ss="";
		
		Scanner lineScan = new Scanner(str); 
         while(lineScan.hasNext()) {
             String word = lineScan.next(); 
             s += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
         }
		System.out.println(s.trim());
	}
}

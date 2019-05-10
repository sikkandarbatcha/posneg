import java.io.*;
import java.util.*;
class lex
{	
	public static void main(String[] args)throws Exception
	{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        char c[]=str.toCharArray();
		Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);    
        }	
	}
}

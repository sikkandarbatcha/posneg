import java.util.*;
import java.io.*;
class vowstring
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int len = str.length();int f=0;
		for(int i=0;i<len;i++)
		{
			if((str.charAt(i) == 'a') || 
                (str.charAt(i) == 'e')  ||
                (str.charAt(i) == 'i') || 
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u')) {
				f=1;
                
            }
			
		}
		if(f==1)
		{
			System.out.println(" Yes ");
		}
		else
				System.out.println(" No ");
	}
}	
			
	

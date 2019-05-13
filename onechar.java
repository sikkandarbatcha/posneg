import java.util.*;
import java.io.*;
class onechar {

    public static void main(String[] args)throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String ss = bf.readLine();
		int len = str.length();
		int l = ss.length();
		int f=0;
        if(len==l)
		{
			for(int i =0;i<len;i++)
			{
				if( ss.contains( str.substring( 0, str.length()-1)) || ss.contains(  str.substring(1, str.length() )) )
				{
					f=1;
				}
			}
			
		}
		if(f==1)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}	
    }
}

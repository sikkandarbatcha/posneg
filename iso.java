import java.util.*;
import java.io.*;
class iso
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		char arr[] = str.toCharArray();
		int len = str.length();int f =0;
		for(int i =0;i<len-1;i++)
		{
			if(arr[i] == arr[i + 1])
			{
				
				f=1;
			}
			
			
		}
		if(f==0)
		{
				System.out.print("Yes");
		}
		else 
		{
			System.out.print("No");
		}
	}	
		
		
	
}	

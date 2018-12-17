import java.util.*;
import java.io.*;
class strnumeric 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		boolean num = true;
		num = str.matches("-?\\d+(\\.\\d+)?");
		if(num)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}	

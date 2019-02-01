import java.util.*;
class sqrt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int pd =1;
		pd = n*m;
		int sqrt = (int) Math.sqrt(pd);
		if(sqrt*sqrt==pd)
		{
			System.out.print("Yes");
		}
		else
			System.out.print("No");
		
	}
}	

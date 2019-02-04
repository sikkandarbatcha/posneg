import java.util.*;
class kab
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m>n)
		{
			System.out.print(m-n);
		}
		else	
			System.out.print(n-m);
	}
}	

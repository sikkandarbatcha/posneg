import java.util.*;
class pdeven
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = 0;
		s = n*m;
		if(s%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}
	}
}	
		

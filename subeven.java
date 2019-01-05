import java.util.*;
class subeven
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum =0;
		sum = m-n;
		if(sum%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}
	}
}

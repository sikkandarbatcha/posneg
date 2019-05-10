import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		System.out.println(fact(n));
	}
		static int fact(int n)
		{
			if(n==1 || n==0)
			return 1;
			else
			return (fact(n-1)*n);
		}
}	

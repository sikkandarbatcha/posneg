import java.util.*;
class palnum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;int sum=0;int r=0;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}	

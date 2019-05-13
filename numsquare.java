import java.util.*;
class numsquare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int r=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			temp=temp+(r*r);
			
		}
		System.out.print(temp);
	}
}	

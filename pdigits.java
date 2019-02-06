import java.util.*;
class pdigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int pd=1;int temp =0;
		while(n>0)
		{
			temp=n%10;
			pd*=temp;
			n/=10;
		}
		System.out.print(pd);
	}
}	

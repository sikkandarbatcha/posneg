import java.util.*;
class numrev
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int temp=0;
		while(n!=0)
		{
			temp = temp*10;
			temp  = temp + n%10;
			n=n/10;
		}
		System.out.print(temp);
	}
}	

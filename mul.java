import java.util.*;
class mul
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();int mul=1;
		while(b!=0)
		{
			mul*=a;
			--b;
		}
		System.out.println(mul);
	}
}	

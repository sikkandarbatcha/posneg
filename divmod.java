import java.util.*;
class divmod
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		char b = sc.next().charAt(0);
		double c = sc.nextInt();
		double r;
		switch(b)
		{
			case '/': 
				r=a/b;
				System.out.print(r);
				break;
			case '%':
				r=a%b;
				System.out.print(r);
				break;
		}
	}
}	

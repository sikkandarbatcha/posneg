import java.util.*;
class hrmin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int h,r;
		h=m/60;
		r=m-(60*h);
		System.out.println(h+ " " + m);
	}
}	

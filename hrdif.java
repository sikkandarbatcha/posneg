import java.util.*;
import java.lang.*;
class hrdif
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int dif1 = Math.abs(h2 - h1);
		int dif2 = Math.abs(m2 - m1);
		System.out.println(dif1 + " " + dif2);
	}
}	

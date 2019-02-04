import java.util.*;
class tsa 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int tss = (l*b)+(b*h)+(l*h);
		int ts = tss*2;
		int v = l*b*h;
		System.out.print(ts+ " " +v);
	}
}	

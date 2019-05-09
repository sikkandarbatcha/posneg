import java.util.*;
class asciiinput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
        int asciicode = c;
		System.out.print(asciicode);
	}
}

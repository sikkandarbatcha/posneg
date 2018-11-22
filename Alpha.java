import util.*;
class Alpha
{
	public static void main(String[ ] arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
    {
		  System.out.println("Alphabet");
    }  
		else
    {
		  System.out.println("No");
    }  
	}
}

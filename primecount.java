import java.util.*;
class primecount {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
		int r = sc.nextInt();
		int c = 0;
		for(int i =l;i<=r;i++)
		{
			 if(i%2!=0)
			{
				c++;
			}
			
		}
        System.out.print(c);
    }
}

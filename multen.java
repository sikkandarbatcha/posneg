import java.util.*;
class multen
{
	static int round(int n) 
    { 
        
        int b = (n / 10) * 10; 
       
        int a = b + 10; 
        
        return (n - a > b - n)? b : a; 
    } 
      
    
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 		 
        System.out.println(round(n)); 
    } 
}	

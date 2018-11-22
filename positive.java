import java.util.*;
class positive 
{
  public static void main(String args[])
  {
    Scanner sc = new Scaneer(System.in);
    int n= sc.nextInt();
    if(n>0)
    {
      System.out.println("POSITIVE");
    }
    else if(n<0)
    {
      System.out.println("NEGATIVE");
    }
    else
    {
      System.out.println("ZERO");
    }
   }
 }  

import java.util.Scanner;
public class large_no_ledder_ifelse {
    public static void main(String umesh[]){
    int a,b,c;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the A number");
    a=obj.nextInt();
    System.out.println("Enter the B number");
    b=obj.nextInt();
    System.out.println("Enter the C number");
    c=obj.nextInt();
    if(a>b)
        if(a>c)
      {
        System.out.println("A is large number");
      }
       else
       {
        System.out.println("C is large  number");
       }   
    
    else if(b>c)
       {
        System.out.println("B os large  number");
       }
       else
       {
        System.out.println("C is large number");
       }
    }
    
}

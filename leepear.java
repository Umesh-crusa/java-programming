import java.util.Scanner;
public class leepear {
    public static void main(String umesh[]){
    int no;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    no=obj.nextInt();
    if(no%400==0)
    {
        System.out.println("it is leep year");
    }
    else if(no%4==0)
    {
        System.out.println("it is leep year");  
    }
    else 
    {
        System.out.println("it is  not leep year");
    }
    }
 }


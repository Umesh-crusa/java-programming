import java.util.Scanner;
public class tarnaryop {
    public static void main(String umesh[]){
    int a,b,c;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the a number");
    a=obj.nextInt();
    System.out.println("Enter the b number");
    b=obj.nextInt();
    System.out.println("Enter the c  number");
    c=obj.nextInt();
    int sto=a>b?a>c?a:c:b>c?b:c;   
    System.out.println("it is the large number"+(sto)); 
}
}

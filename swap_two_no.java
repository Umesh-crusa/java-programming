import java.util.Scanner;
public class swap_two_no {
    public static void main(String umesh[])
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number a");
        a=obj.nextInt();
        System.out.println("Enter the number b");
        b=obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a number==>"+(a));
        System.out.println("b number==>"+(b));
    }
    
}

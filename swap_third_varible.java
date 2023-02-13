import java.util.Scanner;
public class swap_third_varible {
    public static void main(String umesh[])
    {
        int a,b,c;
        Scanner uk=new Scanner(System.in);
        System.out.println("Enter the number A");
        a=uk.nextInt();
        System.out.println("Enter the number B");
        b=uk.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a->"+(a)); 
        System.out.println("b->"+(b)); 
    }
    
}

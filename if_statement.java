import java.util.Scanner;
public class if_statement {
    public static void main(String umesh[]){
    int no;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    no=obj.nextInt();
    if(no%2==0)
    {
        System.out.println("it is even no");
    }
    else if(no%2==1)
    {
        System.out.println("it is odd no");
    }
    }
}

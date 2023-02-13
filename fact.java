import java.util.Scanner;
public class fact {

    public static void main(String umesh[]){
    int i,no,fact=1;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    no=obj.nextInt();
    for(i=1;i<=no;i++)
    {
        fact=fact*i;
    }
    System.out.print("fact no->"+(fact));
    }
}

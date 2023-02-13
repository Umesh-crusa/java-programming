import java.util.Scanner;
public class numbercount {

    public static void main(String umesh[]){
    int i,no,stor=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    no=obj.nextInt();
    for(i=1;i<=no;i++)
    {
         stor=stor+i;
    }
      System.out.println("sum of total number->"+(stor));
    }
}

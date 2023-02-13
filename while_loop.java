import java.util.Scanner;
public class while_loop {
    public static void main(String umesh[])
    {
        int no,sto,re=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter thhe number");
        no=obj.nextInt();
        while(no>0)
        {
          sto=no%10;
          re=re*10+sto;
          no=no/10;
        }
        System.out.println("revers no==>"+(re));
    }
    
}

import java.util.Scanner;
public class primeno {
    public static void main(String umesh[]){
    int no,i,j;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    no=obj.nextInt();
    for( i=1;i<=no;i++)
    {
        for(j=2;j<=i;j++){
            if(i%j==0)
            break;
        }
           if(j==i)
            System.out.print(j+" ");
           }
         
    }
}
    


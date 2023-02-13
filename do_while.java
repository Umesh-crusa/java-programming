import java.util.Scanner;
class do_while
{
public static void main(String umesh[]){
int i=1,no;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number");
no=obj.nextInt();
do{
    System.out.print("\t"+(i));
    i++;
}
while(i<=no);
}
}
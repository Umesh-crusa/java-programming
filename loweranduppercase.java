import java.util.Scanner;
public class loweranduppercase {
    public static void main(String umesh[]){
    char no,no1;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the character");
    no=obj.next().charAt(0);
    if(no>='A'&&no<='Z') 
   {
         no1=Character.toLowerCase(no);
        System.out.print("lower case--> "+no1);
    } 
        
    else 
    {
        no1=Character.toUpperCase(no);
        System.out.print("lower case--> "+no1);

    }
    }

}

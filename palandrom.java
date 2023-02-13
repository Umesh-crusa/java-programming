import java.util.Scanner;
public class palandrom {
    public static void main(String umesh[]){
    int no,sto,re=0,comp;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    no=obj.nextInt();
     comp=no;
    while(no>0)
    {
     sto=no%10;
     re=re*10+sto;
     no=no/10;
    }
    if(comp==re)
    {
        System.out.println("it is palandrom no");
    }
    else 
    {
        System.out.println("it is not palandrom no"+re);
    }
    }
} 
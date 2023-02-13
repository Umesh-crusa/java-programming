import java.util.Scanner;
public class swatchcasebreak {
    public static void main(String umesh[]){
    int a;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    a=obj.nextInt();
    switch(a)
    {
        case 0: 
                  System.out.println("sunday"+(a));
                  break;
        case 1: 
                  System.out.println("monday"+(a)); 
                  break;        
        case 2 :
                  System.out.println("tuesday"+(a));
                  break;
        case 3: 
                  System.out.println("wednesday"+(a)); 
                  break;  
        case 4: 
                  System.out.println("thursday"+(a));
                  break;
        case 5: 
                  System.out.println("friday"+(a)); 
                  break;   
                 
        case 6: 
                  System.out.println("saturday"+(a)); 
                  break; 
        default:     System.out.println("***it wrong key***"); 
                    break;                                                      
    }
    }
}

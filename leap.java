import java.util.Scanner;


public class JavaApplication6 {

    
    public static void main(String[] args) {
         Scanner in= new Scanner(System.in);
        int a;
        System.out.print("enter the number:");
        a=in.nextInt();
       if(a%4==0)
       System.out.print(a+ " is leap year");
       else
       System.out.print(a+ " is not leap year");
    }
    
}
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n,fact=1;
       System.out.print("enter the number:");
       n=in.nextInt();
       for(int i=n;i>=1;i--)
       {
           fact=fact*i;
           n--;
                   
          
       }
       System.out.print(fact);
       
    }
    
}
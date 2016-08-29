package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
       
        Scanner in =new Scanner(System.in);
        int n;
        System.out.print("enter the number:");
        n=in.nextInt();
       for(int i=1;i<=n;i++)
       {
         System.out.println(n*i); 
       }
        
    }
    
}
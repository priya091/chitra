import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
       
        Scanner in =new Scanner(System.in);
        int a=0,b=1,c,count=10;
        System.out.print(a+","+b);
        
       for(int i=1;i<=count;i++)
       {
           
         c=a+b;
         System.out.print(","+c);
         a=b;
         b=c;
         
       }
        
    }
    
}

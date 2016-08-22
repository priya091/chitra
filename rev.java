import java.util.Scanner;

public class JavaApplication3 {

   
     
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        int n,rev=0;
        System.out.print("enter the number:");
        n=in.nextInt();
        while(n!=0)
        {
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        
        System.out.print(rev);
        
    }
    
}

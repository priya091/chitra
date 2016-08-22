import java.util.Scanner;

public class JavaApplication5 {

   
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b,c;
        System.out.print("enter the number:");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b&&a>c)
          System.out.print(a);
        else if(b>c)
            System.out.print(b);
        else
            System.out.print(c);
    }
    
}

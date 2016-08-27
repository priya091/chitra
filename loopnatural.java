import java.util.Scanner;

public class JavaApplication6 {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
      int n,sum=0,i=1;
      System.out.print("Enter the number");
      n=in.nextInt();
      
     while(i<=n)
      {
          sum=sum+i;
          ++i;
      }
      System.out.print("sum is " +sum);
    }
    
}
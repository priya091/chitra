import java.util.Scanner;

public class JavaApplication6 {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
      int n,sum=0;
      System.out.print("Enter the number");
      n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
          sum=sum+i;
      }
      System.out.print("sum is " +sum);
    }
    
}
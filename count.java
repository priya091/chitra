import java.util.Scanner;

public class JavaApplication6 {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
     
      int n;
      int count=0;
      System.out.print("Enter the number");
      n=in.nextInt();
      while(n>0)
      {
          n=n/10;
          count++;
      }
      
      System.out.print(count);
     
    }
    
}
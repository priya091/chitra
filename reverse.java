import java.util.Scanner;


public class JavaApplication7 {

    
    public static void main(String[] args) {
         Scanner in= new Scanner(System.in);
       char n;
        System.out.print("enter the character:");
        n=in.nextLine().charAt(0);
        if(n>='a'&& n<='z'|| n>='A'&&n<='Z')
                {
                    System.out.print(n+" is alphabet");
                }
        else
             System.out.print(n+" is  not alphabet");
            
        }
    }
    
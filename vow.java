package javaapplication8;
import java.util.Scanner;

public class JavaApplication8 {

   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
      char n;
        System.out.print("enter the character:");
        n=in.next().charAt(0);
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='u')
        {
            System.out.print(n+ " is vowel");
        }
        else
             System.out.print(n+ " is consonant");
    }
}
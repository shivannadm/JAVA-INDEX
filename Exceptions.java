// Exception 
import java.util.*;
public class Exceptions {
 public static void main(String[] args) { 
 Scanner scan = new Scanner(System.in);
int a,b,c;
System.out.print("Enter the Two Interger Values\nA :");
a=scan.nextInt();
System.out.print("B :");
b=scan.nextInt();
scan.close();
try {
     if(b==0)
            throw new ArithmeticException("Divide By Zero");
     c=a/b;
            System.out.println("\nThe Value of "+a+" / "+b+" is "+c);
    }catch(ArithmeticException e)
   {
           System.out.println("Enter a non zero number for B!!!");
  }
 }
}

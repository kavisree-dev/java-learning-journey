import java.util.Scanner;
public class simple_calc {
    public static void main(String[] args){
    Scanner scal = new Scanner(System.in);
   System.out.print("Enter the first number to calculate (addition,subtraction,multiplication,division):");
   double a = scal.nextDouble();
   System.out.print("Enter the second number to calculate (addition,subtraction,multiplication,division):");
   double b = scal.nextDouble();
   System.out.println("Addition:"+(a+b));
   System.out.println("Subtraction:"+(a-b));
   System.out.println("Multiplication:"+(a*b));
   System.out.println("Division:"+(a/b));
    scal.close();
    }
    
}

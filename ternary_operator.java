import java.util.Scanner;
public class ternary_operator {
 public static void main(String[] args){
    Scanner greater=new Scanner(System.in);
    System.out.print("Enter the first integer:");
    int first=greater.nextInt();
    System.out.print("Enter the second integer:");
    int second=greater.nextInt();

/*String result=first>second?"The "+first+" number is greater than "+second:"The "+second+" number is greater than "+first;
  condition without bracket is also work.*/

String result=(first>second)?"The "+first+" number is greater than "+second:"The "+second+" number is greater than "+first;
System.out.println(result);
greater.close();
 }   
}

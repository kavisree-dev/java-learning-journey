import java.util.Scanner;
public class ifelsepractice3 {
    public static void main(String[] args){
Scanner fizzbuzz=new Scanner(System.in);
System.out.print("Enter a number:");
double number=fizzbuzz.nextDouble();
if(number%3==0 && number%5==0){
    System.out.println("The number is divisible by both 3 and 5.");}
else{
    System.out.println("The number is not divisible by both 3 and 5");}
fizzbuzz.close();
    }
}

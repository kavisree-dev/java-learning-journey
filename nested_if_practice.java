import java.util.Scanner;
public class nested_if_practice {
   public static void main(String[] args) {
    Scanner loan=new Scanner(System.in);
    System.out.print("Enter your salary:");
    int salary=loan.nextInt();
    System.out.print("Enter your age:");
    int age=loan.nextInt();
    if(salary>=20000 || age<=25){
        System.out.println("Enter the required loan amount:");
        int amount=loan.nextInt();
        if(amount<=50000){
            System.out.println("You are eligible for loan.");
        }
        else if(amount>50000){
            System.out.println("Maximum loan amount is 50000.");
        }
    }
else{
    System.out.println("You are not eligible for loan.");
}
loan.close();
   }
}

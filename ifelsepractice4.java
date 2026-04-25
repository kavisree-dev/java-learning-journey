import java.util.Scanner;
public class ifelsepractice4 {
    public static void main(String[] args){
        Scanner evenodd=new Scanner(System.in);
        System.out.print("Enter the number to check even or odd:");
        int num=evenodd.nextInt();
        if (num%2==0){
            System.out.println("The number is even.");}
        else{
            System.out.println("The number is odd.");}
            evenodd.close();
    }
}


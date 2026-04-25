import java.util.Scanner;
public class ifelsepractice2{
    public static void main(String[] args){
        Scanner Scholarship=new Scanner(System.in);
        System.out.print("Enter your income:");
        int income=Scholarship.nextInt();
        if(income>7000)
            System.out.println("Scholarship is available");
        else
            System.out.println("Scholarship is not available");
        Scholarship.close();
    }
}
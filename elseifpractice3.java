import java.util.Scanner;
public class elseifpractice3 {
  public static void main(String[] args){
    Scanner marks=new Scanner(System.in);
    System.out.print("Enter maths mark:");
    int maths=marks.nextInt();
    System.out.print("Enter science mark:");
    int science=marks.nextInt();
    System.out.print("Enter social mark:");
    int social=marks.nextInt();
    System.out.print("Enter tamil mark:");
    int tamil=marks.nextInt();
    System.out.print("Enter english mark:");
    int english=marks.nextInt();
    int total_mark=Math.addExact(Math.addExact(Math.addExact(Math.addExact(maths,science),social),tamil),english);
    double average=total_mark/5;
    System.out.println(" The total mark is "+total_mark);
    System.out.println("The average is "+average);

    if(average<35){
        System.out.println("Additional class is required.");
    }
    else{
        System.out.println("You are good to go.");
    }
marks.close();
  }  
}

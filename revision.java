import java.util.Scanner;
public class revision {
    public static void main(String[] args){
    Scanner rev = new Scanner(System.in);
    System.out.print("Enter your name:");
    String name = rev.nextLine();
    System.out.print("Enter your age:");
    int age = rev.nextInt();
    System.out.print("Enter your address:");
    rev.nextLine();
    String address = rev.nextLine();
    System.out.print("Enter value a:");
    int a = rev.nextInt();
    System.out.print("Enter value b:");
    int b = rev.nextInt();
    System.out.print("Enter value c:");
    int c = rev.nextInt();
    int d =a*b*c;
    int e =a+b+c;
    System.out.print("Enter your score(for 100):");
    double score =rev.nextDouble();
    double convert = (double)(Math.sqrt(score));
    System.out.print("Enter your department:");
    rev.nextLine();
    String department =rev.nextLine();
    System.out.println("Your name is "+name);
    System.out.println("Your age is "+age);
    System.out.println("Your address is "+address);
    System.out.println("The d divided by e value is: "+d/e);
    System.out.println("Your score is "+convert);
    System.out.println("Your department is "+department);
    rev.close();
    }
    
}

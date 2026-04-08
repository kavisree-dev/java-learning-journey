import java.util.Scanner;
public class Day4_userinput {
    public static void main(String[] args){
    Scanner phonemodel = new Scanner(System.in);
    System.out.print("Enter model name:");
    String name = phonemodel.nextLine();
    System.out.print("Enter model price:");
    int price = phonemodel.nextInt();
    System.out.print("Enter width of the model:");
    double width = phonemodel.nextDouble();
    System.out.print("is this a good model?:");
    boolean isGood = phonemodel.nextBoolean();
    System.out.print("do you buy this model?(yes/no):");
    String response = phonemodel.next();
    //boolean Buy = response.equalsIgnoreCase("yes");//this is for other strings
    System.out.println("The phone model is "+name);
    System.out.println("The "+name+" phone cost is Rs"+price);
    System.out.println("The "+name+" phone width is "+width+"mm");
    System.out.println("you said the model is good: "+isGood);
    System.out.println("you choose to buy: "+response);
    phonemodel.close();
    }
}

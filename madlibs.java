import java.util.Scanner;
public class madlibs {
    public static void main(String[] args){
    //Mad libs game
    Scanner scanner = new Scanner(System.in);
    String adjective1;
    String noun;
    String adjective2;
    String verb1;
    String verb2;
    System.out.println("enter noun(girl name):");
    noun = scanner.nextLine();
    System.out.println("enter adjective1(describe):");
    adjective1 = scanner.nextLine();
    System.out.println("enter verb1(actions):");
    verb1 = scanner.nextLine();
    System.out.println("enter adjective2(describe):");
    adjective2 = scanner.nextLine();
    System.out.println("enter verb2(actions):");
    verb2 = scanner.nextLine();

    System.out.println("There is a girl named " + noun + ".");
    System.out.println("She is very " + adjective1 + " and dreams of building a better future.");
    System.out.println("Everyday she, " + verb1 + " with determination despite the challenges around her.");
    System.out.println("Sometimes, she feels pressure and doubt, but she never gives up.");
    System.out.println("She chooses to " + verb2 + " herself and keep moving forward.");
    System.out.println(noun + "is truly a " + adjective2 + "and inspiring girl.");                    
scanner.close();
    }
}

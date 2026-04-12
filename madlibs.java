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

    System.out.println("A "+noun+" is putting "+adjective1+" effort to land on a job to prevent her from evil eyes which always around her. ");
    System.out.println("She is everyday "+verb1+" very hardly for that");
    System.out.println("She "+verb2+" herself");
    System.out.println("She is a "+adjective2+" girl");
    System.out.println(noun+" support herself");

    }
}

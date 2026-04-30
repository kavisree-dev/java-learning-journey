import java.util.Scanner;
public class switch_case_practice_1 {
    public static void main(String[] args){
        Scanner day=new Scanner(System.in);
        System.out.println("Enter the day: ");
        String Day=day.nextLine();
        switch(Day){
        case "Monday":System.out.println("It's Monday");
        break;
         case "Tuesday":System.out.println("It's Tuesday");
        break;
         case "Wednesday":System.out.println("It's Wednesday");
        break;
         case "Thursday":System.out.println("It's Thhursday");
        break;
         case "Friday":System.out.println("It's Friday");
        break;
         case "Saturday":System.out.println("It's Saturday");
        break;
         case "Sunday":System.out.println("It's Sunday");
        break;
        default:System.out.println("Invalid input");
        }
        
    }
}

import java.util.Scanner;
public class ifelse_userstring_comp2 {
    public static void main(String[] args){

    Scanner marriage=new Scanner(System.in);
    System.out.print("Enter yes if meghana dead:");
    String meghana=marriage.nextLine();
    if(meghana.equals("yes")){
        System.out.println("surya meets ramya");
    }
    else{
        System.out.println("surya weds meghana ");
    }
    marriage.close();
    }
}

import java.util.Scanner;
public class ifelse_userstring_comp {
    public static void main(String[] args){

    Scanner cricket=new Scanner(System.in);
    System.out.print("Enter the status(win or loose)of RCB:");
    String RCB=cricket.nextLine();
    if(RCB.equals("win")){
        System.out.println("EE SALA CUP NAMADHEY");
    }
    else{
        System.out.println("cup illa");
    }
    cricket.close();
    }
}

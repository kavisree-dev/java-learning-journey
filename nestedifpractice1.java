import java.util.Scanner;
public class nestedifpractice1{
    public static void main(String[] args){
        Scanner outing=new Scanner(System.in);
        System.out.print("Enter if it is kfc:");
        boolean kfc=outing.nextBoolean();
        System.out.print("Enter if it is chicken:");
        boolean chicken=outing.nextBoolean();
        if(kfc){
            System.out.println("I will enter into kfc.");

            if(chicken){
                System.out.println("I will eat.");
            }
            else{
                System.out.println("I will eat cheese burger.");
            }
        }
        else{
            System.out.println("I will not enter into the other hotels.");
        }
        outing.close();
    }
}
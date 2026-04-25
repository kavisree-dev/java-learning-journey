import java.util.Scanner;
public class elseifpractice1{
    public static void main(String[] args){
Scanner elif=new Scanner(System.in);
System.out.print("Enter your 10th mark:");
int mark=elif.nextInt();
if(mark>=400){
    System.out.println("You will get a iphone");
}
else if(mark>=300){
    System.out.println("you will get a video game");
}
else{
    System.out.println("you will not get any price");}
    elif.close();
}
}
    

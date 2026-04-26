import java.util.Scanner;
public class elseifpractice2 {
    public static void main(String[] args){
Scanner score=new Scanner(System.in);
System.out.print("Enter the score:");
int scor=score.nextInt();
if(scor<50){
    System.out.println("You need to improve.");
    }
else if(scor>=50 && scor<=70){
    System.out.println("Good job");
    }
else if(scor>70){
        System.out.println("Excellent performance");
    }
    score.close();
    }
}
    
    


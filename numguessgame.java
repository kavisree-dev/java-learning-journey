import java.util.Scanner;
public class numguessgame {
    public static void main(String[] args){
//number guessing game--one chance.
//Generate random number 1 to 10
int secretNumber = (int)(Math.random()*10)+1;
Scanner sc = new Scanner(System.in);
System.out.println("Number Guessing Game");
System.out.print("Guess a number between 1 and 10:");
int guess = sc.nextInt();
if(guess == secretNumber){
    System.out.println("Correct! You won!");
}
else{
    System.out.println("Wrong! Number was "+secretNumber);
}  
sc.close();  

    }
}

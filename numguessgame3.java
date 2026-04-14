import java.util.Scanner;
public class numguessgame3 {
    public static void main(String[] args){
        int secretNumber = (int)(Math.random()*10)+1;
        Scanner sc = new Scanner(System.in);
        int chances = 3;
        System.out.println("Number Guessing Game");
        System.out.println("You have 3 chances");
        for(int i=1;i<=chances;i++){
            System.out.print("Chance "+i+": Enter your guess:");
            int guess = sc.nextInt();
            if(guess == secretNumber){
                System.out.println("Correct! You won!");
                sc.close();
                return;
            }
            else{
                System.out.println("Wrong!Try again...");
            }    
            }
            System.out.println("Game Over! Number was:"+secretNumber);
            sc.close();
        }
    }


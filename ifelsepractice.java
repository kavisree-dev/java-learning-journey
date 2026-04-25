import java.util.Scanner;
public class ifelsepractice{
    public static void main(String[] args){
Scanner evaluation=new Scanner(System.in);
System.out.print("Enter kavi's maths mark:");
int maths=evaluation.nextInt();
System.out.print("Enter kavi's social mark:");
int social=evaluation.nextInt();
System.out.print("Enter kavi's science mark:");
int science=evaluation.nextInt();
if(maths>=35)
    System.out.println("kavi's maths mark is "+maths +". She passed the maths exam");
else
    System.out.println("she got fail mark in the maths exam.");
if(social>=35)
    System.out.println("kavi's social mark is "+social +". She passed the social exam");
else
    System.out.println("she got fail mark in the social exam.");
if(science>=35)
    System.out.println("kavi's science mark is "+science +". She passed the science exam");
else
    System.out.println("she got fail mark in the science exam.");

    }
    
}
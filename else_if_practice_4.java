import java.util.Scanner;
public class else_if_practice_4 {
    public static void main(String[] args){
    Scanner traffic_light=new Scanner(System.in);
    System.out.print("Enter the current light of the traffic light(should be like RED,YELLOW,GREEN):");
    String color=traffic_light.nextLine();

if(color.equals("RED")){
        System.out.print("STOP");
}
else if(color.equals("YELLOW")){
    System.out.print("GET READY");
}
else if(color.equals("GREEN")){
        System.out.print("GO");
}
traffic_light.close();
 }
}

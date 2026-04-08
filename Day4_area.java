import java.util.Scanner;
public class Day4_area {
    public static void main(String[] args){
    //calculating area of a rectangle
    double width = 0;
    double height = 0;
    double area = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter width:");
    width=scanner.nextDouble();
    System.out.print("enter height:");
    height=scanner.nextDouble();
    area = width*height;
    System.out.println("the width is:"+width);
    System.out.println("the height is:"+height);
    System.out.println("the area is:"+area+"cm^2");
    scanner.close();
    }
    
}

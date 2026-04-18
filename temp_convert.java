import java.util.Scanner;
public class temp_convert {
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        System.out.print("Enter the temperature(in celcius):");
        double temp = tc.nextDouble();
        double fahrenheit = (temp*9/5)+32;
        double kelvin = temp+273.15;
        System.out.println("The temperature in fahrenheit is "+fahrenheit);
        System.out.println("The temperature in kelvin is "+kelvin);
        tc.close();
        

    }
    
}

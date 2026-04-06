public class Day2_arithmetic_operators{
    public static void main(String[] args)
    {
     //arithmetic operators
     int x=10;
     int y=2;
     int z;
     //addition
     z=x+y;
     System.out.println(z);
     //subtraction
     z=x-y;
     System.out.println(z);
     //multiplication
     z=x*y;
     System.out.println(z);
     //division
     z=x/y;
     System.out.println(z);
     //remainder
     z=x%y;
     System.out.println(z);
     //augmented assignment operator
     x+=y;
     System.out.println(x);
     x-=y;
     System.out.println(x);
     x*=y;
     System.out.println(x);
     x/=y;
     System.out.println(x);
     x%=y;
     System.out.println(x);
     //increment and decrement operator
     x++;
     System.out.println(x);
     x++;
     System.out.println(x);
     x--;
     System.out.println(x);
     x--;
     System.out.println(x);
     x--;
     System.out.println(x);
     //order of operations [p-e-m-d-a-s]
     double result = 4+5*(9-1)/4.0;
     System.out.println(result);

    }
}
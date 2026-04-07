public class Day3_logical_operators {
    public static void main(String[] args){
       boolean c=true;
       boolean d=false;
       //not operator
       System.out.println(!c);
       System.out.println(!d);
       //or operator
       /*1   1    true
         1   0    true
         0   1    true
         0   0    false */
       System.out.println(c||d);
       //and operator
       /*1    1   true
         1    0   false
         0    1   false
         0    0   false */
       System.out.println(c&&d);
       /*precedence
       NOT
       AND
       OR */
    }
}

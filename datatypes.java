public class datatypes {
    public static void main(String[] args){
    /*1)PRIMITIVE DATATYPES
        -byte
        -short
        -int
        -long
        -float
        -double
        -boolean
        -char
     */
    //types are storage matters.
    //byte:(min -128(-2^7) max 127(2^7-1))
    byte a=-128;
    byte b=127;
    System.out.println(a);
    System.out.println(b);

    //short:(min -32,768(2^15) max 32,767(2615-1))
    short c=-32768;
    short d=32767;
    System.out.println(c);
    System.out.println(d);

    //int:(min -2,147,483,648(2^31) max 2,147,483,647(2^31-1))
    int e=-2147483648;
    int f=2147483647;
    System.out.println(e);
    System.out.println(f);

    //long:(min -9,223,372,036,854,775,808(2^63) max 9,223,372,036,854,775,807(2^63-1)),should end with L.
    long g=-9223372036854775808L;
    long h=9223372036854775807L;
    System.out.println(g);
    System.out.println(h);

    //float: -can take up to 6-7 decimals, should end with f or F (because by default any decimal value is considered as double in java).
    float i=1.1234567f;
    float j=1.12345677f;
    System.out.println(i);
    System.out.println(j);

    //Double: - can take up to 15 decimals, we commonly use double for storing decimals.
    double k=1.123456789012345;
    System.out.println(k);

    //char: -- a single character can be stored in char, -String is an object that represents a sequence of characters(internally, a String consist of a sequesnce of char values arranged in a specific order), -using single quotation.
    char character='A';
    System.out.println(character);
    String greeting="heloo";
    System.out.println(greeting.charAt(3));
    //boolean: -true and false
    boolean isThis=true;
    boolean isThat=false;
    System.out.println(isThis);
    System.out.println(isThat);

    }
}

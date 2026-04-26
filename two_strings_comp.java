import java.util.Scanner;
public class two_strings_comp {
    public static void main(String[] args){
        //int a=10;//store in stack
        String name="sree";//store in a string pool of heap eg abc
        String name1="sree";// in abc
        String n1= new String("sree");//in ac
        String n2= new String("sree");//in ab
        System.out.println(name1.equals(name));//this is correct --sree==sree
        System.out.println(name1==name);//this is correct for respective string method --abc==abc
        System.out.println(n1.equals(n2));//this is correct --sree==sree
        System.out.println(n1==n2); //--ac==ab notequal
        System.out.println(name1.equals(n1));//this is correct --sree==sree
        System.out.println(name1==n1);//abc==ac not equals
    }
}

public class ifelselogicalop {
    public static void main(String[] args){
        boolean cricket=true;
        boolean basketball=false;
        boolean handball=true;
        boolean football=true;
        if(cricket||basketball){
            System.out.println("Don't call me");}
        else {
            System.out.println("Call me when you get to the ground");}
        if(handball&&football){
            System.out.println("play with me");}
        else{
            System.out.println("play with others");
        }
    }
    
}

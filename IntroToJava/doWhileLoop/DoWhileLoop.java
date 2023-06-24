package IntroToJava.doWhileLoop;

public class DoWhileLoop {
    public static void main (String [] args){
        int i = 0; 
        do{
            System.out.println("Not foreverloop: The count is: " + i );
            i++;
        } while (i < 10);
    }
}

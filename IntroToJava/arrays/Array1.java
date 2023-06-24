package IntroToJava.arrays;

public class Array1 {

    static String [] cars = {"BMW", "Audi", "Mercedes", "Toyota", "Honda", "Ford", "Vauxhall", "Volkswagen", "Ferrari", "Lamborghini"};

  
    public static void main (String [] args){

    	String[] vehicle = new String[5]; // populating Array
    	vehicle[2] = "Ferrari";
    	
        System.out.println( "This car is a " + cars[4]);
        
        System.out.println("this vehicle is " + vehicle[2]);

    }
    
}
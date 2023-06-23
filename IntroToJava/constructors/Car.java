package IntroToJava.constructors;

public class Car {

    //attributes / variables

    String model;
	String color;
    String fuelTypes;
    
    // constructor 
    
    public Car(String model, String color, String fuelTypes) {
    	this.model = model; 
    	this.color = color; 
    	this.fuelTypes = fuelTypes; 
    	
    	// this essentially sets everything 
	}
    
    
    //actions  / methods 
    
   
    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelTypes() {
		return fuelTypes;
	}

	public void setFuelTypes(String fuelTypes) {
		this.fuelTypes = fuelTypes;
	}


    public static void main (String args[]){
    	
    	Car BMW = new Car("X5", "Blue" , "Petrol");
        System.out.println(BMW.fuelTypes);  
        
        Car Audi = new Car("A3", "Red", "Deisel");
        System.out.println(Audi.model + Audi.color + Audi.fuelTypes);
    }
    
}


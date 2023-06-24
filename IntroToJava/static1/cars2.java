package IntroToJava.static1;

public class cars2 {
	
	String name; 
	String model;
	String fuelType; 
	int topSpeed; 
	public static int counter;
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		cars2.counter = counter;
	}


	public cars2(String name, String model, String fuelType, int topSpeed) {
		this.name = name;
		this.model = model; 
		this.fuelType = fuelType; 
		this.topSpeed = topSpeed;
		counter++;
		
	}
	
	
	public static void main (String args[]) {
		
		cars2 Buggati = new cars2("Buggati", "Chiron", "Petrol", 300);
		cars2 Lambo = new cars2("Lambo", "Urus", "Petrol", 220);
		cars2 Ferrari = new cars2("Ferrari", "LaFerrari", "Petrol", 260);
		cars2 RollsRoyce = new cars2("RollsRoyce", "Phantom", "Diseal", 180); 
		
		System.out.println(Buggati.getModel() +  Lambo.getModel() + Ferrari.getModel() + RollsRoyce.getModel());
		System.out.println(counter);
		
	}

}

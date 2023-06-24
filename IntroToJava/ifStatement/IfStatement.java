package IntroToJava.ifStatement;

public class IfStatement {

	public static void main (String [] args) {
		
		boolean isLoggedIn = false;
		
		
		if (isLoggedIn) {
			System.out.println("User log in success");
		} else{
			System.out.println("An error has occurred, please try again");
		}
	}
}
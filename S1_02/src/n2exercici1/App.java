package n2exercici1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char askName = Input.scanningForChar("Do you wish to introduce your name? y/n");
		String yourName = "yourName";
		boolean correctName = false;
		if (askName == 'y' || askName == 'Y') {
			while (!correctName) {
				yourName = Input.scanningForString("Please introduce your name");
				System.out.println("Your name is " +yourName);
				correctName = Input.scanningForYesNo("is that correct?");
			}	
		}
		byte yourAge = Input.scanningForByte("Great, now introduce your age please");
		System.out.println(yourName +", you are " +yourAge+ " years old");
		
		//float 
		
	}

}

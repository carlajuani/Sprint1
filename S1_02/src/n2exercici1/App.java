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
		System.out.println(yourName +", you are " +yourAge+ " years old\n");
		
		int yourInt = Input.scanningForInt("Let's do some math now. What is the product of " +yourAge+ " for 12?");
		if (yourInt == (yourAge*12)) {
			System.out.println("Great! Have you realized that you've lived for " +yourInt+ " months?\n");
		} else {
			System.out.println(yourInt+ " is not correct, but did you know you have lived for " +(yourAge*12)+ " months?\n");
		}
		float yourFloat = Input.scanningForFloat("Ok, from 0.0 (less cool) to 10.0 (inmensely cool) how did you liked that fact?\n");
		if (yourFloat < 5.0) {
			System.out.println("Well that's ok, you are not easily impressed... Still, a " +(yourFloat)+ "? Harsh...\n");
		} else {
			System.out.println("Yey! I'm glad you enjoyed it a bit, it's not easy making this exercise entertaining! Thanks for your " +yourFloat+ "!\n");
		}
		
		double yourDouble = Input.scanningForDouble("Ok, last one. Now could you rate the last movie you saw? Same deal, from 0.0 to 10.0");
		System.out.println("A " +yourDouble+ " out of 10 huh? Now which one was it? Elaborate that answer...\nI'm joking, we're done:)\n");
	}

}

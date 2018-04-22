import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-21-2018
*/

public class P3_YouAndYourAge {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		System.out.print("What is your name? ");
		String name = input.nextLine();
		System.out.print("And how old are you? ");
		int age = 0;
		if(input.hasNextInt()){
			age = input.nextInt(); 
		}
		System.out.println("Wow "+name+", you've been alive "+age+" years? Amazing.");
	}

}

import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-21-2018
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("How many lines to draw? ");
		if(input.hasNextInt()){
			int height = input.nextInt();
			drawNumbersRight(height);
		} else {
			System.out.println("Invalid entry : Input must be integer ");
		}		
	}
	
	public static void drawNumbersRight(int height){
		for(int i=1; i<=height; i++){
			for(int j =1; j <=(height-i); j++){
				System.out.print(" ");			
			}
			for(int k = 1; k<=i ; k++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

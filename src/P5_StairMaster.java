import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-21-2018
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		int staHeight = 0;
		int staWidth = 0;	
		Scanner input = new Scanner( System.in);
		System.out.print("How many stairs in your staircase? ");
		if(input.hasNextInt()){
			staHeight = input.nextInt();
		  System.out.print("How wide should each stair be? ");
		  if(input.hasNextInt()){
			  staWidth = input.nextInt();
			  stairProduce(staHeight, staWidth);
		  } else {System.out.println("Invalid entry: Input must be integer ");}
		} else {System.out.println("Invalid entry: Input must be integer ");}
		
		
	}
	
	public static void stairProduce(int height, int width){
		String stair = "";
		System.out.println("\nHere is your staircase:");
		for(int w = 0; w < width ; w++){
			stair = stair + "*";
		}
		for(int h = 1; h <= height ; h++){
				System.out.printf("**%"+(h*width)+"s\n",stair);
				System.out.printf("**%"+(h*width)+"s\n",stair);
		}
		
	}

}

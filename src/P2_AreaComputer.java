import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-21-2018
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		boolean isValid = true;
		Scanner input = new Scanner( System.in);
		System.out.print("Length ");
		double a = 0, b = 0, c = 0 ;
		if(input.hasNextDouble()){
			a = input.nextDouble();		
			System.out.print("Base ");
			if(input.hasNextDouble())
			{
					b = input.nextDouble();
				System.out.print("Height ");
				if(input.hasNextDouble()){
					c = input.nextDouble();
				} else isValid = false;
			} else isValid = false;
		} else 
			isValid = false;
		if(!isValid){
			System.out.println(" Invalid entry ");
		}
		
		double area = triangleArea(a, b, c);
		System.out.println("The area is "+area);
	}
	
	public static double triangleArea(double a, double b, double c){
		double s =(a+b+c)/2;
		double area =Math.sqrt(s * (s-a) * (s-b) * (s-c));
		return area;
	}

}

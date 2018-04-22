import java.util.Scanner;
import java.util.StringTokenizer;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-21-2018
*/

public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		System.out.println("L337 Translator");
		Scanner input = new Scanner( System.in);
		System.out.print("Please enter your three words to make L334: ");
		String inputStrings = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputStrings," ");
		boolean flag = true;
		while (st.hasMoreTokens() ) {
				String word = st.nextToken();
				System.out.println(word+" -> "+toL337(word));			
		}		
		input.close();
	}
	
	public static String toL337(String input){
		String temp = "";
		for(int i = 0; i<input.length(); i++){
			temp = temp + toChange(input.charAt(i));
		}
		return temp;
	}
	
	public static String toChange(char ch){
		if(Character.toLowerCase(ch) == 'a')
			return "4";
		else if(Character.toLowerCase(ch) == 'e')
			return "3";
		else if(Character.toLowerCase(ch) == 't')
			return "7";
		else if(Character.toLowerCase(ch) == 'o')
			return "()";
		else
			return ""+Character.toUpperCase(ch);
	}

}

package perfectSquare;

import java.util.Scanner;
import static java.lang.Math.sqrt;

// finds the closest perfect square to the user input
// as wells as the number of steps needed to get there from the user input
public class perfSquare {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		int testNum; //takes a user input
		System.out.println("Enter a number between 1 and 1000: ");
		testNum = scan.nextInt();
		
		for(int i = 1; i < 1000; i++) { //checks testnum + i for a perfect square
			if(Math.sqrt(testNum + i) == (int)Math.sqrt(testNum + i)) {
				System.out.println("Right of testNum: " + (testNum + i));
				System.out.println("Number of steps: " + i);
				break;
			} //checks test num - i for a perfect square, loop until a perfect square is found.
			else if(Math.sqrt(testNum - i) == (int)Math.sqrt(testNum - i)) {
				System.out.println("Left of testNum: " + (testNum - i));
				System.out.println("Number of steps: " + i);
				break;
			}
			
		}
		scan.close();
	}
}
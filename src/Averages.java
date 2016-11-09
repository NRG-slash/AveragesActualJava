import java.util.Scanner;

/**
 * 
 */

/** 
 * 
 * Name: Laturski, Garrett
 * Teacher: Mr.Hardman
 * Assignment 3
 * October 31,2016 
 * 
 */
public class Averages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What's your first mark? ");
		double firstMark = userInput.nextDouble();
		
		System.out.println("What's your second mark? ");
		double secondMark = userInput.nextDouble();
		
		System.out.println("What's your third mark? ");
		double thirdMark = userInput.nextDouble();
		
		System.out.println("What's Your fourth mark? ");
		double fourthMark = userInput.nextDouble();
		
		System.out.println("What's your fifth mark? ");
		double fifthMark = userInput.nextDouble();
        
       
        double average = (firstMark + secondMark + thirdMark + fourthMark + fifthMark) / 5.0;

       System.out.println( String.format("%15s %20.3f", "Mark 1:", firstMark));
       System.out.println( String.format("%15s %20.3f", "Mark 2:", secondMark));
       System.out.println( String.format("%15s %20.3f", "Mark 3:", thirdMark));
       System.out.println( String.format("%15s %20.3f", "Mark 4:", fourthMark));
       System.out.println( String.format("%15s %20.3f", "Mark 5:", fifthMark));
       System.out.println( String.format("%15s %20.3f", "Average:", average));

       userInput.close();
	}

}

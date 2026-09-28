import java.util.Scanner;

public class IT26102345Lab10Q1 {

    public static void main (String [] args) {
	
	    // create a Scanner object for input 
		Scanner input = new Scanner (System.in);
		
		System.out.println ();
		System.out.print ("Enter the mark (0 - 100): ");
		int mark = input.nextInt ();
		
		// first assertion - to check if the mark is in the valid range
		assert (mark >= 0 && mark <= 100) : "Invalid Mark";
		
		// determine grade
		char grade;
		
		if (mark >= 75) {
		    grade = 'A';
		}
		else if (mark >= 60) {
		    grade = 'B';
		}
		else if (mark >= 50) {
		    grade = 'C';
		}
		else if (mark >= 40) {
		    grade = 'D';
		}
		else {
		    grade = 'F';
		}
		
		// second assertion - to check if the correct grade is assigned
		assert (mark >= 75 && grade == 'A') ||
		       (mark >= 60 && mark < 75 && grade == 'B') ||
			   (mark >= 50 && mark < 60 && grade == 'C') ||
		       (mark >= 40 && mark < 50 && grade == 'D') ||
			   (mark < 40 && grade == 'F') : "Incorrect Grade Assigned";
			   
		System.out.println ();
		System.out.println ("Mark is Validated");
		System.out.println ("The Grade for the Entered Mark is: " + grade);
	}
}
		
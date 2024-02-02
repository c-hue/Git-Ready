import java.util.Scanner;

public class CollegeHousing {

	public static void main(String[] args) {
		// Initiate scanner 
		Scanner scnr = new Scanner(System.in);
		
		// Initiate variables
		double points = 0;
		String answer;
		
		// Distance from Campus
		System.out.println("How far do you live from campus? (Choose A, B, or C)");
		System.out.println("(A) Out of State or Further\n"
						+ "(B) Out of Local County\n"
						+ "(C) Within Local County\n");
		
		// Scan user's input
		loop: while (true) {
			System.out.print("Your Answer: ");
			answer = scnr.next().toLowerCase();
			
			// Add points according to answer
			switch (answer) {
			case "a":
				points += 5;
				break loop;

			case "b":
				points += 3;
				break loop;
				
			case "c":
				points += 1;
				break loop;
				
			// If user does not input A, B, or C, make them input a letter again
			default:
				System.out.println("Invalid answer. Please input 'A', 'B', or 'C.'\n");
				continue loop;
			}
			
		}
				
		// Disability
		System.out.println("\nDo you have a disability? (Choose A or B)");
		System.out.println("(A) Yes\n"
						 + "(B) No\n");
		
		// Scan user's input
		loop: while (true) {
			System.out.print("Your Answer: ");
			answer = scnr.next().toLowerCase();
			
			// Add points according to answer
			switch (answer) {
			case "a":
				points += 4;
				break loop;

			case "b":
				points += 0;
				break loop;
				
			// If user does not input A or B, make them input a letter again
			default:
				System.out.println("Invalid answer. Please input 'A' or 'B'\n");
				continue loop;
			}
			
		}
		
								
		// On-campus job
		System.out.println("\nDo you have an on campus job? (Choose A or B)");
		System.out.println("(A) Yes\n"
				 		 + "(B) No\n");
		
		// Scan user's input
		loop: while (true) {
			System.out.print("Your Answer: ");
			answer = scnr.next().toLowerCase();
			
			// Add points according to answer
			switch (answer) {
			case "a":
				points += 2.5;
				break loop;

			case "b":
				points += 0;
				break loop;
				
			// If user does not input A or B, make them input a letter again
			default:
				System.out.println("Invalid answer. Please input 'A' or 'B'\n");
				continue loop;
			}
			
		}
									
		// Age
		System.out.println("\nHow old are you? (Choose A, B, or C)");
		System.out.println("(A) 17-20\n"
						  +"(B) 21-30\n"
						  +"(C) >31\n");
		
		// Scan user's input
		loop: while (true) {
			System.out.print("Your Answer: ");
			answer = scnr.next().toLowerCase();
			
			// Add points according to answer
			switch (answer) {
			case "a":
				points += 3;
				break loop;

			case "b":
				points += 2;
				break loop;
				
			case "c":
				points += 1;
				break loop;
				
			// If user does not input A, B, or C, make them input a letter again
			default:
				System.out.println("Invalid answer. Please input 'A', 'B', or 'C.'\n");
				continue loop;
			}
			
		}		
		
		// Student Year		
		System.out.println("\nWhat college year are you in? (Choose A, B, C, or D)");
		System.out.println("(A) Year 1\n"
				  		  +"(B) Year 2\n"
				  		  +"(C) Year 3\n"
				  		  +"(D) Year 4+\n");
		
		// Scan user's input
		loop: while (true) {
			System.out.print("Your Answer: ");
			answer = scnr.next().toLowerCase();
			
			// Add points according to answer
			switch (answer) {
			case "a":
				points += 2;
				break loop;

			case "b":
				points += 1.5;
				break loop;
				
			case "c":
				points += 1;
				break loop;
			
			case "d":
				points += 0.5;
				break loop;
				
			// If user does not input A, B, C, or D make them input a letter again
			default:
				System.out.println("Invalid answer. Please input 'A', 'B', 'C', or 'D.'\n");
				continue loop;
			}
			
		}
		
		// Income
		System.out.println("\nWhat is your income? (Choose A, B, C, or D");
		System.out.println("(A) $0-$30,000\n"
		  		  		  +"(B) $30,001-$65,000\n"
		  		  		  +"(C) $65,001-$90,000\n"
		  		  		  +"(D) >$90,000\n");
		
		// Scan user's input
		loop: while (true) {
			System.out.print("Your Answer: ");
			answer = scnr.next().toLowerCase();
			
			// Add points according to answer
			switch (answer) {
			case "a":
				points += 4;
				break loop;

			case "b":
				points += 3;
				break loop;
				
			case "c":
				points += 2;
				break loop;
			
			case "d":
				points += 1;
				break loop;
				
			// If user does not input A, B, C, or D make them input a letter again
			default:
				System.out.println("Invalid answer. Please input 'A', 'B', 'C', or 'D.'\n");
				continue loop;
			}
			
		}
		
		// Close scanner
		scnr.close();
		
		// Output total housing points
		System.out.println("----\n----\n----\nYour total housing points is..." + points + "!");
		
	}

}

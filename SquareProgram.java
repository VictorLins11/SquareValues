import java.util.Scanner;

public class SquareProgram {
	public static void main(String args[]) {
		
		SquareDeclarations square = new SquareDeclarations();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the value of the Square side: ");
		square.setSide(keyboard.nextDouble());
		
		System.out.println("\nWhat you want to see(area or perimeter)?: ");
		String answer = keyboard.next();
		
		while(!answer.toUpperCase().equals("AREA") && !answer.toUpperCase().equals("PERIMETER")) {
			System.out.println("\nInvalid - try again");
			System.out.println("\nWhat you want to see(area or perimeter)?: ");
			answer = keyboard.next();
		}
		
		if(answer.toUpperCase().equals("AREA")) {
			System.out.println("\nThe square area of value is: "+square.getArea());
		} else
		if(answer.toUpperCase().equals("PERIMETER")) {
			System.out.println("\nThe square perimeter of value is: "+square.getPerimeter());
		}
		
		for(int i = 0; i < 100; i++) {
		
		System.out.println("\nDo you want to see another value(yes or no)?: ");
		answer = keyboard.next();
		
		while(!answer.toUpperCase().equals("YES") && !answer.toUpperCase().equals("NO")) {
			System.out.println("\nInvalid - try again");
			System.out.println("\nDo you want to see another value(yes or no)?: ");
			answer = keyboard.next();
		}
		
		if(answer.toUpperCase().equals("YES")) {
			System.out.println("\nEnter the value of the Square side: ");
			square.setSide(keyboard.nextDouble());
			
			System.out.println("\nWhat you want to see(area or perimeter)?: ");
			answer = keyboard.next();
			
			while(!answer.toUpperCase().equals("AREA") && !answer.toUpperCase().equals("PERIMETER")) {
				System.out.println("\nInvalid - try again");
				System.out.println("\nWhat you want to see(area or perimeter)?: ");
				answer = keyboard.next();
			}
			
			if(answer.toUpperCase().equals("AREA")) {
				System.out.println("\nThe square area of value is: "+square.getArea());
			} else
			if(answer.toUpperCase().equals("PERIMETER")) {
				System.out.println("\nThe square perimeter of value is: "+square.getPerimeter());
			}
		}else
		if(answer.toUpperCase().equals("NO")) {
			System.out.println("\nThank you always come back ");
			break;
		}
		}
	}
}
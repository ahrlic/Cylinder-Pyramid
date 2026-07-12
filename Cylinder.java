
import java.util.Scanner;
/*
 * Student Name: Ariana Hrlic
 * Lab Professor: Sara Khan
 * Due Date: October 11/2024
 * Modified: September 10/1
 * Description: To calculate the volume of a cylinder
 */ 

public class Cylinder {

	public static void main(String[] args) {

		// Declarations
		double radius = 0, height = 0;

		// create scanner object
		Scanner input = new Scanner(System.in);

		// create cylinder object
		CylinderPyramid cyl = new CylinderPyramid();

		System.out.println("Please enter the height: ");
		height = input.nextDouble();
		
		System.out.println("Please enter the radius: ");
		radius = input.nextDouble();
		
		
		//check if input is a valid value
		if ((height < 0) || (radius < 0)) {
			System.out.println("No negative numbers please!!");
			System.exit(0);
			
		} else {
			
			//send inputs from the user to the object
			cyl.setHeight(height); 
			cyl.setRadius(radius);

			// display results
			System.out.printf("Your Cylider pyramid's volume is: %.3f cubed%n", cyl.CalcVolume());
			System.out.print("Program by Ariana Hrlic");
		}
		
		// close the scanner for file safety
		input.close();

	}

}

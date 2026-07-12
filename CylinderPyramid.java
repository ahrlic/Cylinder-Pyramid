
/*
 * Student Name: Ariana Hrlic
 * Lab Professor: Sara Khan
 * Due Date: October 11/2024
 * Modified: September 10/01
 * Description: Object to calculate the volume of a cylinder
 */

public class CylinderPyramid {

	// Declarations
	static final double PI = Math.PI;
	private double height, radius;

	/**
	 * Empty constructor 
	 */
	public CylinderPyramid() {
		
	}

	// set the height from a user
	public void setHeight(double newHeight) {
		height = newHeight;
	}

	// set the radius from a user
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	/**
	 * To calculate the volume of each of the three cylinders of the cylinder
	 * pyramid
	 * 
	 * @return A double containing the volume
	 */
	public double CalcVolume() {

		// Declarations
		double volume1, volume2, volume3, volume;

		volume1 = PI * (Math.pow(radius, 2)) * height;
		volume2 = PI * (Math.pow(radius * 0.8, 2)) * height;
		volume3 = PI * (Math.pow(radius * 0.64, 2)) * height;

		volume = volume1 + volume2 + volume3;

		return volume;

	}

}

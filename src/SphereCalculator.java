// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_3_3
// File Name: SphereCalculator.java

// Program that asks for a radius of a circle 
// and returns the radius, volume, and surface area. 

// Imports that I used
import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereCalculator {

    public static void main(String[] args) {

        // Makes a new scanner to scan the input from the user
        Scanner scan = new Scanner(System.in);

        // Variables that I use
        double rad, vol, surf;

        //Formats the decimal places to specifications (4 Places)
        DecimalFormat fmt = new DecimalFormat("0.####");

        // Asks for and recieves the radius from the user (Stores it in 'rad')
        System.out.print("Enter the radius of the circle: ");
        rad = scan.nextDouble();

        // Calculations for the volume and surface area (Uses Math class)
        vol = ((double) 4 / 3) * (Math.PI * Math.pow(rad, 3));
        surf = (4 * (Math.PI * Math.pow(rad, 2)));

        // Output for the user to read (Formatted to 4 decimal places)
        System.out.println("The radius is " + fmt.format(rad) + ".");
        System.out.println("The volume is " + fmt.format(vol) + ".");
        System.out.println("The surface area is " + fmt.format(surf) + ".");

    }
}

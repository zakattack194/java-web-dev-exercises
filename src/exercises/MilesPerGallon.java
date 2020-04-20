package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many miles have you driven?");
        float miles = input.nextInt();
        System.out.println("Hello, how many gallons have been used?");
        float gallons = input.nextInt();
        float mpg = miles/gallons;
        System.out.println("The miles per gallon is " + mpg + ".");
    }
}

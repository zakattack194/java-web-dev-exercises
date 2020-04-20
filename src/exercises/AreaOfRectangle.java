package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of the rectangle?");
        int length = input.nextInt();
        System.out.println("Hello, what is the width of the rectangle?");
        int width = input.nextInt();
        int area = width * length;
        System.out.println("The area of the rectangle is " + area + ".");
    }
}

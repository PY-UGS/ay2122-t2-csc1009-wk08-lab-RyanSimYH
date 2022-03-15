package Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");

        double radius = 0;
        try {
            radius = in.nextDouble();
            if (radius < 1) {
                throw new IllegalArgumentException("Radius negative:" + Double.toString(radius));
            } else if (radius > 1000) {
                throw new Exception("Radius over limit(1000):" + Double.toString(radius));
            } else {
                CircleWithException circle = new CircleWithException(radius);
                System.out.println("The radius is " + circle.getRadius());
                System.out.println("The area is " + circle.getArea());
                System.out.println("The diameter is " + circle.getDiameter());
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception caught: Input not valid ");
        }
    }
}

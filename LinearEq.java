import java.util.Scanner;

/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    Scanner input3 = new Scanner(System.in);
    double a = input3.nextDouble();
    double b = input3.nextDouble();
    double c = input3.nextDouble();
    double result = (double) (c - b) / 2;
    System.out.println( a + " * " + "x" + " + " + b + " = " + c);
    System.out.print("x" + " = " + result);
}
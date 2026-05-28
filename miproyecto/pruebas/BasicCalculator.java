

/**
 * DESCRIPTION:
 * This app is meant to accept two integers from the user, 
 * calculate their average, and print the result. 
 * If the average is 50 or greater, it should print "Pass". 
 * Otherwise, it should print "Fail".
 */
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int average = (num1 + num2) / 2;

        System.out.println("The average is: " + average);

        if (average >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
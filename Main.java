/*
Name: Anusri Kadam
PRN: 23070126016
Batch: SY AIML A1
*/

// Main.java
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Input from user
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // Calling functions from separate files
            System.out.println("Addition: " + Addition.add(a, b));
            System.out.println("Subtraction: " + Subtraction.subtract(a, b));
            System.out.println("Multiplication: " + Multiplication.multiply(a, b));
            try {
                System.out.println("Division: " + Division.divide(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Error in Division: " + e.getMessage());
            }

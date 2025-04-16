// SquareRoot.java
public class SquareRoot {
    // This method returns the square root of a number, throws exception for negative input
    public static double sqrt(double a) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}

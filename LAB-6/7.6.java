class Calculator {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return dividend / divisor;
    }
}
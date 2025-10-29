package Calculator;
public class Calculator1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero.");
        return a / b;
    }

    public double power(int base, int exp) {
        return Math.pow(base, exp);
    }

    public int modulus(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Modulus by zero not allowed.");
        return a % b;
    }
}

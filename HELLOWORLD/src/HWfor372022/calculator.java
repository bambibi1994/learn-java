package HWfor372022;

public class calculator {

    public int add(int num1, int num2) {
        return num1+ num2;
    }
    public int subtract( int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    public int square(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    public int squareRoot(int num1) {
        return (int) Math.sqrt(num1);
    }
    public double sin(double num1) {
        return Math.sin(num1);
    }
    public double cos(double num1) {
        return Math.cos(num1);
    }
    public double tan(double num1) {
        return Math.sin(num1);
    }
    public int factorial(int num1) {
        int result = 1;
        for (int i = 1; i < num1 + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        calculator cal = new calculator();
        //System.out.println(cal.factorial(12)); 
    }
}

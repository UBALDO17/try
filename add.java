public class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}
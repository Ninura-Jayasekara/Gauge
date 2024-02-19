import com.thoughtworks.gauge.Step;

public class MathStepImplementation {

    @Step("Add two numbers <number1> and <number2>")
    public void addTwoNumbers(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Addition Result: " + result);
    }

    @Step("Subtract <number2> from <number1>")
    public void subtractNumbers(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("Subtraction Result: " + result);
    }

    @Step("Multiply <number1> by <number2>")
    public void multiplyNumbers(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("Multiplication Result: " + result);
    }

    @Step("Divide <number1> by <number2>")
    public void divideNumbers(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int result = number1 / number2;
        System.out.println("Division Result: " + result);
    }
}

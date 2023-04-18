
// this is a program to find a factorial number using a recursion
public class Main {
    private static int factorial(int value) {

        if (value == 1) {
            return 1;
        }

       return  factorial(value - 1) * value;
    }

    public static void main(String[] args) {

        int value = 5;

        System.out.println("Factorial of " + value + " is: " + factorial(value));
    }
}
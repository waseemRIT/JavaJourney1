import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        float num1, num2;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("PLease Insert your first Number\n--> ");
            num1 = scan.nextFloat();
            System.out.println("Please Insert your second Number/n--> ");
            num2 = scan.nextFloat();

            // Trying the Addition Function
            System.out.println(addition(num1, num2));

            // Trying the Subtraction Function
            System.out.println(subtraction(num1, num2));

            // Trying the Multiplication Function
            System.out.println(multiplicaion(num1, num2));

            // Trying the Division Fubnction
            System.out.println(division(num1, num2));


            // Trying the Power Function
            System.out.println(raise( (int) num1, (int) num2));
        }

        catch (InputMismatchException msg){
            System.out.println("Your Number should be a Float");
        }

        scan.close();


    }


    // The Addition Function
    public static double addition(float num1, float num2) {
        return num1 + num2;
    }

    // The Subtraction Function
    public static double subtraction(float num1, float num2) {
        return num1 - num2;
    }

    // The Division Function
    public static double division(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("DIVIONS BY 0 - CHANGE SECOND NUMBER");
            return 0;
        } else {
            return (double) num1 / num2;
        }
    }

    // The Multiplication Function
    public static double multiplicaion(float num1, float num2) {
        return num1 * num2;
    }

    // The Power Function -> Returns base ** exponent
    public static long raise(long base, long exponent) {
        long result = 1;
        for (int index = 0; index < exponent; index++) {
            result = result * base;
        }
        return result;
    }
}
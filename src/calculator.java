public class calculator{
    public static void main(String[] args){

        // Trying the Addition Function
        System.out.println(addition(5, 6));

        // Trying the Subtraction Function
        System.out.println(subtraction(6, 9));

        // Trying the Multiplication Function
        System.out.println(multiplicaion(9, 9));

        // Trying the Division Fubnction
        System.out.println(division(9, 5));

    }

    // The Addition Function
    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    // The Subtraction Function
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    // The Division Function
    public static double division(int num1, int num2){
        return (double) num1 / num2;
    }

    // The Multiplication Function
    public static int multiplicaion(int num1, int num2){
        return  num1 * num2;
    }
    

}

public class Primitives {
    public static void main(String[] args){
        /*
        Declairing Variables LoL
         */
        int x;
        int w,y,q;
        x = 4;
        System.out.println(x == 3);
        byte thamanya;
        thamanya = 99;
        System.out.println(thamanya + x);
        System.out.println(power(x, thamanya));

    }

    public static long power(int num1, int num2){
        // Returns the num1 ** num2
        return (long) Math.pow(num1, num2);

    }


}

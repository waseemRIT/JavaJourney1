public class Arithmetic {
    public static void main(String[] args) {
        int x;
        float y;
        x = 9;
        y = 10.0f;
        System.out.println(x + y);
        String my_string = new String("WoW");
        System.out.println(my_string.getClass());
        example("waseeem");
        helloName("Waseem", x);
    }

    public static void example(String str) {
        // returns the assci number of the string <str>
        int theChar = str.charAt(2);
        System.out.println(theChar);
    }

    public static void helloName(String name, int x){
        System.out.print("Hello " + name);
            }


}

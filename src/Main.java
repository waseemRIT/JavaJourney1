public class Main {

    public static void main(String[] args) {
        evens(20);
    }

    public static void evens(int n){

        //For loop
        /*for (int i=n; i>=0; i--) {
            if (i % 2 == 0) {
                System.out.print(i+"\n");
            }*/

        //While loop
        int i = n;
        while(i>=0) {
            if (i%2==0) {
                System.out.print(i+"\n");
            }
            i--;
        }

    }


}


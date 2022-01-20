public class Loops {
    public static void main(String[] args){
        System.out.print(for_counter(100));
        System.out.print("\n");
        System.out.println(while_counter(100));
    }

    public static int for_counter(int n){
        int sum = 0;
        for (int i =0; i<=n ;i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int while_counter(int n) {
        int i = 0;
        int sum = 0;
        while (i<=n){
            sum += i;
        i++;
            }
        return sum;
    }

}

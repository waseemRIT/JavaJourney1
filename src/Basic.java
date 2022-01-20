
public class Basic {
    public static void main(String[] args){
        // should print multiples of 3 and 7 and if multiple of both 7 and 3 skip
        for (int i = 0; i<=100; i++){
            if ( (i % 3 == 0) || (i % 7 == 0) ){
                if ((i % 3 == 0) && (i % 7 == 0)){
                    continue;
                }
                else {
                    System.out.print(i + " ");
                }
            }
        }
    }

}

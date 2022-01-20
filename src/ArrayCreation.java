public class ArrayCreation{
    public static void main(String[] args){
        int[] stored_arr = arr_creation();


    }

    public static int[] arr_creation(){
        int[] arr = new int[100];
        int i;
        for (i=0; i<100; i++){
            arr[i] = i;
        }

        return arr;
    }




}

import java.util.Scanner;

public class Miscellany {
    public static void main(String[] args){

        // Reverse String
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please Insert a String to Reverse! \n-->");
        String stringToRevrese = scan1.nextLine();
        System.out.println(reverseChars(stringToRevrese));
        scan1.close();




        // Array Creation
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Ensert Array Length!");

        int arrayLength = Integer.parseInt(scan.nextLine());

        int[] square1 = squares(arrayLength);

        scan.close();

        for (int i =0; i < square1.length; i++ ){
            System.out.println(square1[i]);
        }




    }

    public static String reverseChars(String str){

        String reveresed = "";

        for (int i= str.length()-1; i >=0; i--){
            reveresed += str.charAt(i);
        }
        return reveresed;

    }

    /// returns an array
    public static int[] squares(int n){
         int[] intArr;
         intArr = new int[n];

         for (int i =0; i< intArr.length; i++){
             intArr[i] = i;
         }
         return intArr;
    }

}

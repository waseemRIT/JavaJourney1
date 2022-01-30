package PracticeQuestions;

import java.util.Scanner;

public class LargeNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number: ");
        String numList = scanner.nextLine(); // enters a string of numbers -> 1234

        int strLength = numList.length();

        long strSum = 0;

        for (int i =0; i<strLength; i++){
            long num = Character.getNumericValue(numList.charAt(i));
            strSum +=  num;
        }
        // should be sum of 1 + 2 + 3 + 4
        System.out.println(strSum);
    scanner.close();


    }



}

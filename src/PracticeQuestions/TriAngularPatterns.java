package PracticeQuestions;

import java.util.Scanner;


public class TriAngularPatterns {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ROWS: ");
            int rows = scanner.nextInt();
            System.out.print("Columns: ");
            int columns = scanner.nextInt();

            for (int i =0; i<columns; i++){
                for (int j = 0; j<=i; j++){
                    System.out.print("*" + " ".repeat(i) + "*");
                }
                System.out.println();
            }
            scanner.close();
        }

}

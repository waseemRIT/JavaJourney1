import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditing {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File Name: ");
        String fileName = scanner.nextLine();

        try (
                FileWriter fw = new FileWriter(fileName);
                PrintWriter writer = new PrintWriter(fw);
        )
        {
            String breakingPoint = "anything";
            while (!breakingPoint.equals("")){
                System.out.print("INSERT NEW LINE: ");
                String phrase= scanner.nextLine();
                breakingPoint = phrase;
                writer.println(phrase);

            }
            writer.flush();
            scanner.close();
        }

        catch(IOException e){
        }

        System.out.println("OUT SIDE OF THE LOOP");
    }

}

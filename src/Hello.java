import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        helloYou();

    }

    public static void helloYou(){
            Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }

}

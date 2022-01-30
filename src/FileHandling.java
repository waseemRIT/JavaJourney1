import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Path:");
        String filePath = scanner.nextLine();




//        try {
//            //   info(filePath);
//            readFile(filePath);
//        }
//        catch(IOException e1){
//            System.out.println("File nono exist LoL");
//        }


    }

    public static void readFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);

        BufferedReader reader = new BufferedReader(fileReader);


        // reading the lines of the file
        String line = "";
        while((line = reader.readLine()) != null){
            System.out.println(reader.readLine().strip());
            System.out.println("-----------------------------------------------------");
        }


        reader.close();
        fileReader.close();

    }


    public static void info(String path){

        // Instantiating the File
        File file1 = new File(path);

        // Check if File Exists
        System.out.println("Check if File Exists");
        boolean fileExist = file1.exists();
        System.out.println(fileExist);


        // Check if it's a directory
        System.out.println("Check if it's a directory");
        boolean fileDirCheck = file1.isDirectory();
        System.out.println(fileDirCheck);

        // to get the Absolute Path
        System.out.println(" to get the Absolute Path");
        String absPath = file1.getAbsolutePath();

        System.out.println(absPath);

        // File Size
        System.out.println("the Size of file in Bytes:");
        Long fileSize = file1.length();

        System.out.println(fileSize);

        // Get File Name
        String fileName = file1.getName();
        System.out.println("File name is : " + fileName);

    }

}

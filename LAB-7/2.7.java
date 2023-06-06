import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileInputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String filename = scanner.nextLine();

        System.out.print("Enter a string to write to the file: ");
        String content = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("File has been written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file");
            e.printStackTrace();
        }

        scanner.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class FileAppender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first file name: ");
        String fileName1 = scanner.nextLine();

        System.out.print("Enter the second file name: ");
        String fileName2 = scanner.nextLine();

        appendFileContents(fileName1, fileName2);

        scanner.close();
    }

    public static void appendFileContents(String fileName1, String fileName2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2, true));
             PrintWriter printWriter = new PrintWriter(writer)) {

            String line;
            while ((line = reader.readLine()) != null) {
                printWriter.println(line);
            }

            System.out.println("File contents appended successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
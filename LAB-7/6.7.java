import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BinaryFileWriter {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        try {
            FileInputStream inputFile = new FileInputStream(fileName);
            FileOutputStream outputFile = new FileOutputStream(fileName + ".dat");

            int byteRead;
            while ((byteRead = inputFile.read()) != -1) {
                outputFile.write(byteRead);
            }

            inputFile.close();
            outputFile.close();
            System.out.println("File successfully converted to binary format.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}
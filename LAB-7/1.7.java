import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a file name: ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist!");
        }
        
        try {
            File newFile = new File("mojPlik.txt");
            FileWriter writer = new FileWriter(newFile);
            writer.write("Witaj, świecie!");
            writer.close();
            System.out.println("File created: " + newFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
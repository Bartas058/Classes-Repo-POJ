import java.io.File;
import java.util.Scanner;

class FileSizeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");
        } else {
            System.out.println("File not found.");
        }

        scanner.close();
    }
}
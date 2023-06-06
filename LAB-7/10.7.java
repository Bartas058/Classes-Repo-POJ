import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileBasedDatabase {

    private static final String DATABASE_FILE = "database.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("1. Add Record");
            System.out.println("2. Delete Record");
            System.out.println("3. Update Record");
            System.out.println("4. Display Records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addRecord(scanner);
                    break;
                case 2:
                    deleteRecord(scanner);
                    break;
                case 3:
                    updateRecord(scanner);
                    break;
                case 4:
                    displayRecords();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }

    private static void addRecord(Scanner scanner) {
        System.out.print("Enter the record to add: ");
        String record = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            writer.write(record);
            writer.newLine();
            System.out.println("Record added successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while adding the record: " + e.getMessage());
        }
    }

    private static void deleteRecord(Scanner scanner) {
        System.out.print("Enter the record to delete: ");
        String recordToDelete = scanner.nextLine();
        
        File inputFile = new File(DATABASE_FILE);
        File tempFile = new File("temp.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            
            String currentLine;
            
            while ((currentLine = reader.readLine()) != null) {
                if (!currentLine.equals(recordToDelete)) {
                    writer.write(currentLine);
                    writer.newLine();
                }
            }
            
            if (inputFile.delete() && tempFile.renameTo(inputFile)) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Error occurred while deleting the record.");
            }
            
        } catch (IOException e) {
            System.out.println("Error occurred while deleting the record: " + e.getMessage());
        }
    }

    private static void updateRecord(Scanner scanner) {
        System.out.print("Enter the record to update: ");
        String recordToUpdate = scanner.nextLine();
        System.out.print("Enter the new value: ");
        String newRecordValue = scanner.nextLine();
        
        File inputFile = new File(DATABASE_FILE);
        File tempFile = new File("temp.txt");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            
            String currentLine;
            
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.equals(recordToUpdate)) {
                    writer.write(newRecordValue);
                } else {
                    writer.write(currentLine);
                }
                
                writer.newLine();
            }
            
            if (inputFile.delete() && tempFile.renameTo(inputFile)) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("Error occurred while updating the record.");
            }
            
        } catch (IOException e) {
            System.out.println("Error occurred while updating the record: " + e.getMessage());
        }
    }

    private static void displayRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATABASE_FILE))) {
            String currentLine;
            
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while displaying records: " + e.getMessage());
        }
    }
}
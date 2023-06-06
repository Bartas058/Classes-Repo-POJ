import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LastNLinesOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines to print: ");
        int n = scanner.nextInt();
        scanner.close();

        List<String> lines = getLastNLinesOfFile("plik.txt", n);
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static List<String> getLastNLinesOfFile(String filename, int n) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                if (lines.size() > n) {
                    lines.remove(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
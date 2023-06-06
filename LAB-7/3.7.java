import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FileStatistics {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(getFileNameFromUser()))) {
            int lineCount = 0;
            int letterCount = 0;
            int numberCount = 0;
            int whitespaceCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letterCount++;
                    } else if (Character.isDigit(c)) {
                        numberCount++;
                    } else if (Character.isWhitespace(c)) {
                        whitespaceCount++;
                    }
                }
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of letters: " + letterCount);
            System.out.println("Number of numbers: " + numberCount);
            System.out.println("Number of whitespace characters: " + whitespaceCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static String getFileNameFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file name: ");
        return reader.readLine();
    }
}
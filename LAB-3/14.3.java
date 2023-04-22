import java.util.Scanner;

class forbiddenChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output;
        
        output = input.replaceAll("[^0-9]+", " ");

        System.out.println(output.trim());
    }
}
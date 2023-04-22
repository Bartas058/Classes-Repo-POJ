import java.util.Scanner;

class printOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println(output);
        
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase());
            result.append(word.substring(1));
            result.append(" ");
        }
        
        String correctOutput = result.toString().trim();
        System.out.println(correctOutput);
    }
}
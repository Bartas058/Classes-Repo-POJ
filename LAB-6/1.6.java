import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Sequences {
    public static void main(String[] args) {
        ArrayList<String> sequences = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String[] sequencesWords = scanner.nextLine().split(" ");
            sequences.addAll(Arrays.asList(sequencesWords));
        }
        
        System.out.println(sequences.toString());
    }
}
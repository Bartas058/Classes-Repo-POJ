import java.util.Scanner;

class alphabetNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        char nextLetter;
        
        if (letter == 'z') {
            nextLetter = 'a';
        } else if (letter == 'Z' ) {
            nextLetter = 'A';
        } else {
            nextLetter = (char) (letter + 1);
        }

        System.out.println(nextLetter);
    }
}
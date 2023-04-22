import java.util.Scanner;

class sequenceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringT = scanner.nextLine();
        String stringR = scanner.nextLine();
        String stringK = scanner.nextLine();

        String finalSequence = stringT.replace(stringR, stringK);
        System.out.println(finalSequence);
    }
}
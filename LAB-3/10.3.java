import java.util.Scanner;

class areEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringA = scanner.nextLine();
        String stringB = scanner.nextLine();

        int positon = -1;
        for (int i = 0; i < stringA.length() && i < stringB.length(); i++) {
            if (stringA.charAt(i) != stringB.charAt(i)) {
                positon = i;
                break;
            }
        }

        if (positon == -1 && stringA.length() == stringB.length()) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println(positon);
        }
    }
}
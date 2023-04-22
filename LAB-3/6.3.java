import java.util.Scanner;

class stringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringT = scanner.nextLine();
        String stringK = scanner.nextLine();
        String strT;
        String strK;
        strT = stringT.toLowerCase();
        strK = stringK.toLowerCase();

        if (strT.contains(strK)) {
            System.out.println("Słowo " + stringK + " znajduje się w ciągu");
        }
        else
            System.out.println("Słowo " + stringK + " nie znajduje się w ciągu");
    }
}
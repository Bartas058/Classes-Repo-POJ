import java.util.Scanner;

class getUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mail = scanner.nextLine();
        String splitFirst = mail.substring(0, mail.indexOf("@"));
        System.out.println(splitFirst);
    }
}
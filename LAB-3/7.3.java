import java.util.Scanner;

class fileExtension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String URLAddress = scanner.nextLine();

        int lastIndex = URLAddress.lastIndexOf("/");
        String fileName = URLAddress.substring(lastIndex + 1);

        System.out.println(fileName);
    }
}
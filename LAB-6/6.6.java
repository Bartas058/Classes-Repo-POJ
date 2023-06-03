import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(str + " is not a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect number format.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
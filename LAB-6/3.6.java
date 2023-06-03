import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class SortedNumbers {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println(numbers.toString());
    }
}
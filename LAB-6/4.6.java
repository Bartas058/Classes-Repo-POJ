import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Collections {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        readSet(scanner.nextLine(), setA);

        readSet(scanner.nextLine(), setB);

        Set<Integer> result = symmetricDifference(setA, setB);
        System.out.println(result.toString());
    }

    private static void readSet(String input, Set<Integer> set) {
        String[] numbers = input.split(" ");
        
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
    }

    private static Set<Integer> symmetricDifference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>(setA);
        result.removeAll(setB);
        setB.removeAll(setA);
        result.addAll(setB);
        
        return result;
    }
}
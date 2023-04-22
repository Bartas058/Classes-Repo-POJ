import java.util.Random;

class RandomNumbers {
    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static Random random = new Random();

    public static int randomElement() {
        int index = random.nextInt(numbers.length);
        return numbers[index];
    }
}

class Main {
    public static void main(String[] args) {
        int randomNumber = RandomNumbers.randomElement();
        System.out.println(randomNumber);
    }
}
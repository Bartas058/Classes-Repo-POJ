import java.util.Scanner;

class isPrefixSuffix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String StringT = scanner.nextLine();
        String StringK = scanner.nextLine();

        String usedWords = "";
        String[] words = StringT.split(" ");
        for (String word : words) {
            if (word.startsWith(StringK)) {
                if (!usedWords.contains(word)) {
                    System.out.println(StringK + " jest przedrostkiem słowa " + word);
                    usedWords += word + " ";
                }
            }
            if (word.endsWith(StringK)) {
                if (!usedWords.contains(word)) {
                    System.out.println(StringK + " jest przyrostkiem słowa " + word);
                    usedWords += word + " ";
                }
            }
        }
    }
}
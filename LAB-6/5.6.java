import java.util.*;

class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordCountMap = new TreeMap<>();
        
        while (scanner.hasNext()) {
            String word = scanner.next();
            int count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, count + 1);
        }

        System.out.println(wordCountMap);
    }
}
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MultilingualDictionary {
    private Map<String, HashSet<String>> dictionary;

    public MultilingualDictionary() {
        dictionary = new HashMap<>();
    }

    public void addTranslation(String word, String translation) {
        HashSet<String> translations = dictionary.getOrDefault(word, new HashSet<>());
        translations.add(translation);
        dictionary.put(word, translations);
    }

    public void removeWord(String word) {
        dictionary.remove(word);
    }

    public HashSet<String> getTranslations(String word) {
        return dictionary.getOrDefault(word, new HashSet<>());
    }
}
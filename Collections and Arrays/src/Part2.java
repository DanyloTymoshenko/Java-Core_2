import java.util.*;
import java.util.HashMap;

public class Part2 {
    public static void main(String[] args) {
        //Step 1 Song's lyrics
        String lyrics = "In the town where I was born\n" +
                "Lived a man who sailed to sea\n" +
                "And he told us of his life\n" +
                "In the land of submarines\n" +
                "So we sailed on to the sun\n" +
                "'Til we found a sea of green\n" +
                "And we lived beneath the waves\n" +
                "In our yellow submarine";


        List<String> wordList = new ArrayList<>(Arrays.asList(lyrics.split("\\s+")));


        List<String> cleanedwords = new ArrayList<>();
        for (String word : wordList) {
            cleanedwords.add(word.replaceAll("[,\\.\\n]", "").toLowerCase());
        }

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : cleanedwords) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Count");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Set<String> uniqueWords = new HashSet<>(cleanedwords);

        List<String> sortedWords = new ArrayList<>(uniqueWords);
        sortedWords.sort(Comparator.comparingInt(String::length));

        System.out.println("\nUnique words sorted by length");
        for (String word : sortedWords) {
            System.out.println(word);
        }

    }
}

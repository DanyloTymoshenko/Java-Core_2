import java.util.*;
import java.util.HashMap;

public class Part1 {
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
        //Step 2 remove commas and \n

        String cleaned_lyrics = lyrics.replace(",", "").replace("\n", "");

        //Step 3 LowerCase
        cleaned_lyrics = cleaned_lyrics.toLowerCase();
        //Step4 To Array
        String[] words = cleaned_lyrics.split("\\s+");


        //Step 5 Count words
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

    /// ///////////////////// PART 3

        List<String> wordsList = new ArrayList<>(Arrays.asList(cleaned_lyrics.split(" ")));

        wordsList.removeIf(word -> word.equals("yellow") || word.equals("submarine"));

        String result = String.join(" ", wordsList);
        System.out.println("/////////// PART 3 ////////////////");
        System.out.println("Lyrics after removing 'yellow' and 'submarine' : ");
        System.out.println(result);

    }
}

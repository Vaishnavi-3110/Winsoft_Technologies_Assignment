import java.util.HashMap;

public class Count_Word {
    public static void main(String[] args) {
        String sentence = "Hello world! This is a sample sentence. Hello world again!";
        HashMap<String, Integer> wordCountMap = countWords(sentence);
        for(String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static HashMap<String, Integer> countWords(String sentence) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        for(String word : words) 
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}

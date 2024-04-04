import java.util.HashMap;

public class Find_Duplicate {
    public static void main(String[] args) {
        String str = "Hello World";
        HashMap<Character, Integer> duplicateChars = findDuplicateCharacters(str);
        for(char ch : duplicateChars.keySet()) {
            if(duplicateChars.get(ch) > 1) {
                System.out.println(ch + ": " + duplicateChars.get(ch) + " times");
            }
        }
    }

    public static HashMap<Character, Integer> findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char ch : str.toCharArray()) {
            if(Character.isLetter(ch)) { 
                
                // case sensitive
                ch = Character.toLowerCase(ch);
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        return charCountMap;
    }
}

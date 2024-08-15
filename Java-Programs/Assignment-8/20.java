/* Write a Java Program to Count the Number of Occurrence of Each Character
Ignoring the Case of Alphabets & Display them. */

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrencesIgnoringCase {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> charCountMap = countCharacterOccurrencesIgnoringCase(str);
        System.out.println("Occurrences of each character ignoring case:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
    public static Map<Character, Integer> countCharacterOccurrencesIgnoringCase(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        return charCountMap;
    }
}

import java.util.*;

public class CalculateWordsFrequency {

    public static void calculateWordsFrequency(List<String> input) {
        TreeMap<String, Integer> freqMap = new TreeMap<>();
        for (String str : input) {
            freqMap.put(str, freqMap.getOrDefault(str,0) + 1);
        }

        for (String word : freqMap.keySet()) {
            System.out.println(word + "|" + freqMap.get(word));
        }
    }

    public static void main(String[] args) {
        calculateWordsFrequency(Arrays.asList("abc", "bcd", "abc"));
    }
}

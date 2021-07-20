import java.util.HashMap;

public class MaxFruitsIntoTwoBaskets {
    public static int findLength(char[] arr) {

        int windowStart = 0, maxLen = 0;
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            char rightChar = arr[windowEnd];
            frequencyMap.put(rightChar, frequencyMap.getOrDefault(rightChar, 0) + 1);

            while (frequencyMap.size() > 2) {

                char leftChar = arr[windowStart];
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);

                if (frequencyMap.get(leftChar) == 0) {
                    frequencyMap.remove(leftChar);
                }

                windowStart++;
            }
            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);

        }
        return maxLen;
    }
}

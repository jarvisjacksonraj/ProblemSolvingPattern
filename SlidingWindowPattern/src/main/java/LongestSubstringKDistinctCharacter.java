import java.util.HashMap;

public class LongestSubstringKDistinctCharacter {

    public static int findDistinctMaxLength(String str, int k) {

        if (str == null || str.length() == 0 || str.length() < k)
            throw new IllegalArgumentException("Pass Valid Input as Arguments");

        int windowStart = 0, maximumLen = 0;
        HashMap<Character, Integer> CharacterFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            //Inclusion of character Increase Length of Substring
            char rightChar = str.charAt(windowEnd);
            CharacterFrequencyMap.put(rightChar, CharacterFrequencyMap.getOrDefault(rightChar, 0) + 1);

            while (CharacterFrequencyMap.size() > k) {

                //Exclusion of character to maintain K Distinct Character in Substring
                char leftChar = str.charAt(windowStart);
                CharacterFrequencyMap.put(leftChar, CharacterFrequencyMap.get(leftChar) - 1);

                //Remove Character from map once the frequency is 0
                if (CharacterFrequencyMap.get(leftChar) == 0) {
                    CharacterFrequencyMap.remove(leftChar);
                }
                windowStart++;
            }
            maximumLen = Math.max(maximumLen, windowEnd - windowStart + 1);

        }

        return maximumLen;
    }

}

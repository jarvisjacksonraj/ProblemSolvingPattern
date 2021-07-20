import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLongestSubstringKDistinctCharacter {
    @Test
    public void testFindMaxLength() {

        int result = LongestSubstringKDistinctCharacter.findDistinctMaxLength("araaci", 2);
        assertEquals(result, 4);

        result = LongestSubstringKDistinctCharacter.findDistinctMaxLength("araaci", 1);
        assertEquals(result, 2);

        result = LongestSubstringKDistinctCharacter.findDistinctMaxLength("cbbebi", 3);
        assertEquals(result, 5);

    }

    @Test
    void testExpectedException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            int result = LongestSubstringKDistinctCharacter.findDistinctMaxLength("", 3);
        });
        assertEquals(thrown.getMessage(), "Pass Valid Input as Arguments");
    }

}

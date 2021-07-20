import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxFruitsIntoTwoBaskets {
    @Test
    public void TestFindMinSubArray() {

        int result = MaxFruitsIntoTwoBaskets.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' });
        assertEquals(result, 3);

        result = MaxFruitsIntoTwoBaskets.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' });
        assertEquals(result, 5);
    }

}
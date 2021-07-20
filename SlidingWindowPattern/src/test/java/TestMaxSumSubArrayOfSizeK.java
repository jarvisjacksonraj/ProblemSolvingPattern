import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxSumSubArrayOfSizeK {

    @Test
    public void TestFindMaxAverage() {
        int result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2});
        assertEquals(result, 9);
        result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[]{2, 3, 4, 1, 5});
        assertEquals(result, 7);
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMinSizeSubArraySum {
    @Test
    public void TestFindMinSubArray() {

        int result = MinSizeSubArraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2});
        assertEquals(result, 2);

        result = MinSizeSubArraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 8});
        assertEquals(result, 1);

        result = MinSizeSubArraySum.findMinSubArray(8, new int[]{3, 4, 1, 1, 6});
        assertEquals(result, 3);
    }

}

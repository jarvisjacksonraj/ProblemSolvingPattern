import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAverageOfSubArrayOfSizeK {

    @Test
    public void TestFindAverages() {
        double[] result = AverageOfSubArrayOfSizeK.findAveragesOfSubArrayOfSizeK(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        assertArrayEquals(result, new double[]{2.2, 2.8, 2.4, 3.6, 2.8});
    }

    @Test
    public void TestFindMaxAverage() {
        double result = AverageOfSubArrayOfSizeK.findMaxAverageOfSubArrayOfSizeK(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        assertEquals(result, 3.6);
    }

}

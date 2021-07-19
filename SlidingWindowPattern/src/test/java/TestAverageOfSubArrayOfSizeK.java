import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAverageOfSubArrayOfSizeK {

    @Test
    public void test1() {
        double[] result = AverageOfSubArrayOfSizeK.findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        assertArrayEquals(result, new double[]{2.2, 2.8, 2.4, 3.6, 2.8});
    }

}

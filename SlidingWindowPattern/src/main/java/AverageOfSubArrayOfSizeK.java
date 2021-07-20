public class AverageOfSubArrayOfSizeK {

    public static double[] findAveragesOfSubArrayOfSizeK(int K, int[] numArr) {

        double[] averageArr = new double[numArr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < numArr.length; windowEnd++) {
            windowSum += numArr[windowEnd];
            if (windowEnd >= K - 1) {
                averageArr[windowStart] = windowSum / K;
                windowSum -= numArr[windowStart];
                windowStart++;
            }
        }

        return averageArr;
    }

    public static double findMaxAverageOfSubArrayOfSizeK(int k, int[] numArr) {

        double windowSum = 0;
        double maximumSum = Integer.MIN_VALUE;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < numArr.length; windowEnd++) {
            windowSum += numArr[windowEnd];
            if (windowEnd >= k - 1) {
                maximumSum = Math.max(maximumSum, windowSum);
                windowSum -= numArr[windowStart++];
            }
        }

        return maximumSum / k;
    }

}

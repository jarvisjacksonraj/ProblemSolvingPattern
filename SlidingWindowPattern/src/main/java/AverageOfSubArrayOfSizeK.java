public class AverageOfSubArrayOfSizeK {

    public static double[] findAverages(int K, int[] numArr) {

        double[] result = new double[numArr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < numArr.length; windowEnd++) {
            windowSum += numArr[windowEnd];
            if (windowEnd >= K - 1) {
                result[windowStart] = windowSum / K;
                windowSum -= numArr[windowStart];
                windowStart++;
            }
        }

        return result;
    }

    public static double findMaxAverage(int k, int[] numArr) {

        int windowStart = 0;
        double windowSum = 0;
        double result = Integer.MIN_VALUE;
        for (int windowEnd = 0; windowEnd < numArr.length; windowEnd++) {
            windowSum += numArr[windowEnd];
            if (windowEnd >= k - 1) {
                result = (result > windowSum) ? result : windowSum;
                windowSum -= numArr[windowStart++];
            }
        }

        return result / k;
    }
}

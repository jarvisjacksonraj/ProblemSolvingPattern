public class MaxSumSubArrayOfSizeK {

    public static int findMaxSumSubArray(int subArraySize, int[] numArr) {

        int windowSum = 0, maximumSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < numArr.length; windowEnd++) {
            windowSum += numArr[windowEnd];
            if (windowEnd >= subArraySize - 1) {
                maximumSum = Math.max(maximumSum, windowSum);
                windowSum -= numArr[windowStart];
                windowStart++;
            }
        }

        return maximumSum;
    }
}

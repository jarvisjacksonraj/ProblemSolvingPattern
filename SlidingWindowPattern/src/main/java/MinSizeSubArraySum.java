public class MinSizeSubArraySum {
    public static int findMinSubArray(int targetSum, int[] numArr) {
        int windowSum = 0, minLen = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < numArr.length; windowEnd++) {
            windowSum += numArr[windowEnd];
            while (windowSum >= targetSum) {
                minLen = Math.min(minLen, windowEnd - windowStart + 1);
                windowSum -= numArr[windowStart];
                windowStart++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

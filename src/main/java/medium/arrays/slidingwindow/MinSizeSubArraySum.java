package medium.arrays.slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinSizeSubArraySum {

    @Test
    public void test() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        Assert.assertEquals(findMinSizeSubArraySum(nums, target), 2);

    }

    public int findMinSizeSubArraySum(int[] a, int target) {
        int p1 = 0, p2 = 0, minLen = Integer.MAX_VALUE, currSum = 0;
        while (p2 < a.length) {
            currSum += a[p2];

            while (currSum >= target) {

                currSum -= a[p1];
                minLen = Math.min(minLen, p2 - p1+1);

                p1++;
            }
            p2++;
        }
        return minLen;
    }
}

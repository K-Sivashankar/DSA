package medium.arrays.slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxConsecutiveOnes3 {

    @Test
    public void test() {
        int[] a = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        Assert.assertEquals(findMaxConsecutiveOnes(a, k), 6);

    }

    public int findMaxConsecutiveOnes(int[] a, int k) {
        int l = 0, count = 0,maxLen=0;
        for (int r = 0; r < a.length; r++) {
            if (a[r] == 0) {
                count++;
            }
            while(count >k)
            {
                count--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return count;
    }
}

package medium.arrays.slidingwindow;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MaxSizeSubArraySum {
@Test
public void test()
{
    int arr[] = {1, 2, 1, 0, 1, 1, 0}, k = 4;
    Assert.assertEquals(findLength(arr,k),5);
}

    public int findLength(int[] nums, int k) {
        int left = 0;
        int curr = 0; // curr is the current sum of the window
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];

                left++;
            }
            ans = Math.max(ans, right - left + 1);

        }

        return ans;
    }
}

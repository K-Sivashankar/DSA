package hard.arrays;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TrappingRainWater {

    @Test
    public void test() {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assert.assertEquals(storeWaterCapacity(heights), 6);
    }

    @Test
    public void test2() {
        int[] heights = {4,2,0,3,2,5};
        Assert.assertEquals(storeWaterCapacity(heights), 9);
    }

    public int storeWaterCapacity(int[] nums) {
        int ans = 0;
        int[] leftMaxHeights = new int[nums.length];
        int[] rightMaxHeights = new int[nums.length];
        leftMaxHeights[0] = nums[0];
        rightMaxHeights[rightMaxHeights.length - 1] = nums[nums.length - 1];
        //find out left heights
        //using prefix sum
        for (int i = 1; i < nums.length; i++) {

            leftMaxHeights[i] = Math.max(leftMaxHeights[i - 1], nums[i]);
        }

        //find out right heights
        //using suffix sum
        for (int i = rightMaxHeights.length - 2; i >= 0; i--) {

            rightMaxHeights[i] = Math.max(rightMaxHeights[i + 1], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {

            ans = ans + Math.max(0, Math.min(leftMaxHeights[i], rightMaxHeights[i]) - nums[i]);


        }

        return ans;

    }

}

package easy.arrays.slidingwindow;

import org.testng.annotations.Test;

//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubArray {

    @Test
    public void test()
    {
        int [] arr={100,200,300,400};
        System.out.println(findMaxSumSubArray(arr,2));

    }
    @Test
    public void test2()
    {
        int [] arr={100, 200, 300, 400};
        System.out.println(findMaxSumSubArray(arr,4));

    }

    public int findMaxSumSubArray(int [] nums,int k)
    {
        int currSum=0,maxSum=0;
        for (int i = 0; i < k; i++) {
            currSum+=nums[i];

        }
        maxSum=Math.max(maxSum,currSum);//since first for loop is finding sum of first window
        //STORE the SUM IN maxSum as above

        //for each iteration find current sum of iteration and update maxSum

        for (int i = k; i < nums.length; i++) {

            currSum = currSum-nums[i-k];
            currSum = currSum+nums[i];
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }

}

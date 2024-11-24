package misc;

import org.testng.annotations.Test;

import java.util.Arrays;

public class PrefixSum {

    @Test
    public void test()
    {
        int [] nums = {2,4,5,7,9};
        System.out.println(Arrays.toString(prefixSum(nums)));
    }
    public static int[] prefixSum(int [] nums)
    {
        int[] psum = new int[nums.length];
        psum[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            psum[i]=psum[i-1]+nums[i];
        }
        return psum;


    }
}

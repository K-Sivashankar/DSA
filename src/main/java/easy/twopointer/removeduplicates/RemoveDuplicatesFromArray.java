package easy.twopointer.removeduplicates;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    @Test
    public void test()
    {
        int[] nums={1,1,2};
        Assert.assertEquals(2,removeDuplicates(nums));
    }
    @Test
    public void test2()
    {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        Assert.assertEquals(5,removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0|| nums[i]!=nums[i-1])
            {
                nums[k++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}

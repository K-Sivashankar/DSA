package easy.twopointer.arrays.removeduplicates;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray2 {

    @Test
    public void test()
    {
        int[] nums={1,1,1,2,2,3};
        Assert.assertEquals(5,removeDuplicates(nums));
    }
    @Test
    public void test2()
    {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        Assert.assertEquals(5,removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<nums.length;i++)
        {
            if( nums[i]!=nums[k-2])
            {
                nums[k++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public int removeDuplicates_Bruteforce(int[] nums)
    {
        Map<Integer, Integer> count = new HashMap<>();
        int k = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) <= 2) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}

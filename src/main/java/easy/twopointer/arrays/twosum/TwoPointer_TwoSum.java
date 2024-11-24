package easy.twopointer.arrays.twosum;

import org.testng.annotations.Test;

public class TwoPointer_TwoSum {


@Test
public void test()
{
    int [] nums = {0,2,3,3,4,6,7,8};
    int target=13;

    twoPointer_TwoSum(nums,target);
}
    public void twoPointer_TwoSum(int [] nums,int target)
    {
            int left=0,right=nums.length-1;
            boolean indexFound = false;

            while(left<right)
            {
                int sum = nums[left]+nums[right];
                if(sum >target)
                {
                    right--;
                }else if(sum<target)
                {
                    left++;
                }else if(sum==target)
                {
                    indexFound=true;
                    System.out.println(left+","+right);
                    break;
                }
            }

            if(!indexFound)
            {
                throw  new RuntimeException("Match not found");
            }

    }
}

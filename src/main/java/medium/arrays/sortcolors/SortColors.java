package medium.arrays.sortcolors;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortColors {
    @Test
    public void test() {
    int[] nums = {2,0,2,1,1,0};
        sortColors_TwoPass(nums);
    }

    public int[] sortColors_TwoPass(int[] nums) {

        int zeroCount=0,oneCount=0;
//        int zeroCount=0,oneCount=0,TwoCount=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0)
            {
                zeroCount++;
            }else if(nums[i]==1)
            {
                oneCount++;
            }

        }

        for (int i = 0; i < nums.length; i++) {
                if(zeroCount>0)
                {
                    nums[i]=0;
                    zeroCount--;
                }else if(oneCount>0)
                {
                    nums[i]=1;
                    oneCount--;
                }
                else
                {
                    nums[i]=2;
                }
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

}

package easy.twopointer.distinctnosinarray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctNumbers {
    @Test
    public void test() {
        int[] nums={4,7,7,2,2,1,3};
        System.out.println(findDistinct_BetterApproach(nums));
    }

    @Test
    public void test2() {
        int[] nums={4};
        System.out.println(findDistinct_BetterApproach(nums));
    }
    @Test
    public void test3() {
        int[] nums={};
        System.out.println(findDistinct_BetterApproach(nums));
    }

    @Test
    public void test1_naive() {
        int[] nums={4,7,7,2,2,1,3};
        System.out.println(findDistinctNaiveApproach(nums));
    }

    //SC for below is O(1)
    public int findDistinct_BetterApproach(int[] nums) {
        /*if (nums.length == 1) {
            return 1;
        } else if (nums.length == 0) {
            return -1;
        }*/
        Arrays.sort(nums);//TC O(n logn)
        List<Integer> list = new ArrayList<>();
        //sort the array O(n log n)
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i==0||nums[i] != nums[i - 1]) {
                count++;
            }
        }
        return count;
    }

    public int findDistinctNaiveApproach(int[] arr)
    {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            // Check if this element is included in result
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // Include this element if not included previously
            if (i == j)
                res.add(arr[i]);
        }
        return res.stream().mapToInt(Integer::intValue).toArray().length;
    }


}

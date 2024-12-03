package easy.arrays.subarrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

/*PSEUDO CODE
 INPUT - int arr
 Output - Boolean Flag

 Step 1: Prefix sum array
 Step 2: if in the prefix sum array same element
 repeats twice it is logical that there exists a sub array whose sum in zero
 Declare sum =0;
 Iterate through the array - keep calculating the sum of array values
 parallely add this inside a HashSet as key , value by default to 1
 if we get set.add as false even once - directly return true
 ---------------------------------------------------------------------
 NOTE : THERE SHOULD BE A DEAFAULT VALUE 0 in the set / MAP key
 --------------------------------------------------------------------

 If we plan to use Map -
 for(int i=0;i<nums.length;i++){
	sum+=nums[i];//0
	if(map.containsKey(sum)) return true;
	map.put(sum, 1);

}
return false;
 */

public class ZeroSum {

    @Test
    public void test1() {
        Assert.assertTrue(zeroSum_BF(new int[] {4, 2, -3, 1, 6}));
        Assert.assertTrue(zeroSum_BF(new int[] {0}));
        Assert.assertFalse(zeroSum_BF(new int[] {}));
        Assert.assertTrue(zeroSum_BF(new int[] {2,-2}));
    }

    /**
     *
     * @param arr
     * @return boolean
     * @author Sivashankar
     * @since 1.1
     * @
     */
    public boolean zeroSum_BF(int[] arr) {
        int sum=0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(!set.add(sum)) {
                return true;
            }

        }
        return false;
    }



}

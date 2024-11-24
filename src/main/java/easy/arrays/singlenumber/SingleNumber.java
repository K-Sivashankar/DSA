package easy.arrays.singlenumber;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    @Test
    public void test() {
        int[] nums = {1, 4, 2, 1, 2,0,0};
        int singleNo = findSingleNumber_Optimised(nums);
//        int singleNo = findSingleNumber_bruteforce(nums);
        System.out.println(singleNo);
    }

    public int findSingleNumber_bruteforce(int[] a) {
       Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
                map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for(Integer i : map.keySet())
        {
            if(map.get(i)==1)
            {
                return i;
            }
        }
        return -1;

    }

    public int findSingleNumber_Optimised(int [] a)
    {
        int result =0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("result :: "+ result +" xor "+a[i] );
            result = result ^ a[i];
            System.out.println(" :: "+result);
        }
        System.out.println();
        return result;
    }
}

package easy.arrays.majorityelement;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MajorityElement {

    @Test
    public void test()
    {
        int arr[] ={2,2,1,1,1,2,2};
        int output = majorityElement(arr);
        System.out.println(output);
    }
//    T: O(nlogn)
//    S: O(1)
       public static int majorityElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        int cnt = 1;
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                cnt++;
            } else {
//                If the first element is majority this below if loop gets executed
                if (cnt > n / 2) {
                    return arr[i - 1];
                }
                cnt = 1;
            }
        }

        //  If the count of the last element is greater than n/2 below gets executed
        if (cnt > n / 2) {
            return arr[n - 1];
        }

        // if no majority element, return -1
        return -1;
    }
        public static int majorityElement_HashMapApproach(int [] arr)
        {

            return -1;
        }
}

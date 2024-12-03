package medium.arrays.slidingwindow;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FindSubArrayWithMaxSum {
    //Fixed window size or Fixed window pattern
    @Test
    public void test()
    {
        int arr[] = {100, 200, 300, 400} , k = 2;
        Assert.assertEquals(find(arr, k),700);
    }

    public int find(int [] a,int k)
    {
        int currSum=0,maxSum=0;
        //take the first window
        for (int i = 0; i < k; i++) {
            currSum+=a[i];
        }

        //imagine your i is at 0,
        // length of subarray should be k
        //so indices will start from 0 to k-1
        //if ur loop starts from i instead of 0 add i to k-1 to find last index
        //so end index will be k-1+i
        // If k is not given , it is variable window size
        // If k is given it is fixed window size
        // k-1+i
        // lets say k=2 , [0 1 2 3] , i should go from 1 to 2 .
        // when  i is 2 ,  currSum=currSum+a[k-1+i]; i.e a[2-1+2]=>a[3]
        //we can give last index as n-k+1 =>4-2+1=>3
        //so i=1;i<3;i++
        /*for (int i = 1; i < a.length-k+1  ; i++) {

        currSum=currSum-a[i-1];
        currSum=currSum+a[k-1+i];
            maxSum = Math.max(currSum,maxSum);

        }*/
                //If you replace all 1's in above by K you get below one
        for (int i=k;i<a.length;i++)
        {
            currSum=currSum-a[i-k];
            currSum=currSum+a[i];
            maxSum = Math.max(currSum,maxSum);

        }
        return maxSum;
    }
}

package easy.arrays.others;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateArrayByLeft {

    @Test
    public void test() {
        int[] nums = {7, 3, 9, 1};
        int[] output = rotateArrays(nums, 9);
        Assert.assertEquals(output, new int[]{3, 9, 1, 7});

    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] output = rotateByLeft(nums, 2);
//        int[] output = rotateArrays(nums, 2);

        Assert.assertEquals(output, new int[]{3, 4, 5, 1, 2});

    }

    //O(d*n) Time complexity
    //O(1)    Space complexity
    public int[] rotateArrays(int[] arr, int d) {
        int count = 1;
        d = d % arr.length;
        while (count <= d) {

            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {


                arr[i - 1] = arr[i];

            }
            arr[arr.length - 1] = temp;
            count++;
        }
        return arr;
    }


    public int[] rotateByLeft(int [] arr,int k)
            //1,2,3,4,5
            //5,4,3,2,1
            //5,4,3,1,2
            //3,4,5,1,2
    {
        k%=arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k);
        reverse(arr,k+1,arr.length-1);


        System.out.println(Arrays.toString(arr));
        return arr;
    }

    void reverse(int[] a,int start,int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

    }

}

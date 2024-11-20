package easy.twopointer.removeelement;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveElement {
    @Test
    public void test() {
        int[] nums = {3, 3, 2, 2};
        Assert.assertEquals(2,trimmedArray(nums,2));
       ;

    }


    @Test
    public void test2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        Assert.assertEquals(5,trimmedArray(nums,2));

    }
    public int trimmedArray(int[] a, int target) {

        int j = 0,count=0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != target) {
                int temp = a[i];
                a[i] = a[j];
                a[j++] = temp;

            }
 count=j;

            }

        while(j<a.length){
            a[j++]=0;

        }


        System.out.println(Arrays.toString(a));



        return count;
    }
}

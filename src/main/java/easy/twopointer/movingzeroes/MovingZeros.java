package easy.twopointer.movingzeroes;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MovingZeros {


    @Test
    public void test() {
        int x[] = {1, 4, 0, 6, 7, 0, 12, 0};
        // Call the method to move zeroes
//        int[] result = moveZeroes(x);
        int[] result = moveZeroes_3(x);

        // Print expected and actual arrays to console
        System.out.println("Expected: " + Arrays.toString(new int[]{1, 4, 6, 7, 12, 0, 0, 0}));
        System.out.println("Actual:   " + Arrays.toString(result));
//        Assert.assertArrayEquals(new int[]{1, 4, 6, 7, 12, 0, 0, 0}, result);
        Assert.assertArrayEquals(new int[]{1, 4, 6, 7, 12, 0, 0, 0}, result);
    }

    @Test
    public void test2() {
        int x[] = {0, 4, 0, 6, 7, 0, 12, 0};
        // Call the method to move zeroes
        int[] result = moveZeroes(x);

        // Print expected and actual arrays to console
        System.out.println("Expected: " + Arrays.toString(new int[]{4, 6, 7, 12, 0, 0, 0, 0}));
        System.out.println("Actual:   " + Arrays.toString(result));
        Assert.assertArrayEquals(new int[]{4, 6, 7, 12, 0, 0, 0, 0}, result);
    }

    @Test
    public void test3() {
        int[] x = {8};
        System.out.println(Arrays.toString(moveZeroes(x)));
        Assert.assertArrayEquals(new int[]{8}, moveZeroes(x));
    }

    @Test
    public void test4() {
        int[] x = {0};
        System.out.println(Arrays.toString(moveZeroes(x)));
        Assert.assertArrayEquals(new int[]{0}, moveZeroes(x));
    }

    @Test
    public void test5() {
        int[] x = {0, 1};
        System.out.println(Arrays.toString(moveZeroes(x)));
        Assert.assertArrayEquals(new int[]{1, 0}, moveZeroes(x));
    }

    @Test
    public void test6() {
        int[] x = {4, 6, 7, 0, 5, 0, 2};
//        System.out.println(Arrays.toString(moveZeroes(x)));
//        Assert.assertArrayEquals(new int[]{4, 6, 7, 5, 2, 0, 0}, moveZeroes(x));
        Assert.assertArrayEquals(new int[]{4, 6, 7, 5, 2, 0, 0}, moveZeroes_3(x));
    }

    @Test
    public void test7() {
        int[] x = {0,5,6,-3,0,1,4};
//        System.out.println(Arrays.toString(moveZeroes(x)));
        System.out.println(Arrays.toString(moveZeroes_3(x)));

//        Assert.assertArrayEquals(new int[]{5,6,-3,1,4,0,0}, moveZeroes(x));
        Assert.assertArrayEquals(new int[]{5,6,-3,1,4,0,0}, moveZeroes_3(x));

    }

    public int[] moveZeroes_Optimised(int[] nums) {


        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // If the current element is non-zero
            if (nums[i] != 0) {

                // Swap the current element with the 0 at index 'count'
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;

                // Move 'count' pointer to the next position
                count++;
            }
        }
        return nums;
    }
        public int[] moveZeroes( int[] nums)
        {

                if (nums.length == 0) {
                    return new int[]{-1};
                } else if (nums.length == 1) {
                    return nums;
                }

            int i = 0, j = 0;

            while (j < nums.length) {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i++] = nums[j];
                    nums[j++] = temp;
                } else {
                    j++;
                }

            }

            return nums;

        }

        /*public int[] moveZeroes_2(int[] nums)
        {

            for (int i = 0,j=1;i <nums.length ; i++,j++) {
                if(nums[j]!=0)
                {
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }

            }
            return nums;
        }*/


 public int[] moveZeroes_3(int[] nums)
        {
//left->Slow pointer
//right -->fast pointer

            int left = 0;
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
            }
            return nums;
        }

    public  void movingZeros_bruteforce(String[] args) {
        int x[] = {1, 4, 0, 6, 7, 0, 12, 0};

        // Call the method to move zeroes
//        int[] result = moveZeroes(x);
        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < x.length; j++) {

                if(x[j]==0)
                {
                    int temp = x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(x));
    }
}

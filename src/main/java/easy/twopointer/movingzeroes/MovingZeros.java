package easy.twopointer.movingzeroes;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MovingZeros {
    @Test
    public void test() {
        int x[] = {1, 4, 0, 6, 7, 0, 12, 0};
        // Call the method to move zeroes
        int[] result = moveZeroes(x);

        // Print expected and actual arrays to console
        System.out.println("Expected: " + Arrays.toString(new int[]{1, 4, 6, 7, 12, 0, 0, 0}));
        System.out.println("Actual:   " + Arrays.toString(result));
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
        System.out.println(Arrays.toString(moveZeroes(x)));
//        Assert.assertArrayEquals(new int[]{4, 6, 7, 5, 2, 0, 0}, moveZeroes_Optimised(x));
        Assert.assertArrayEquals(new int[]{4, 6, 7, 5, 2, 0, 0}, moveZeroes(x));
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

}

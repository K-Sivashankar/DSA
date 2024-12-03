package easy.arrays.missingnumber;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MissingNumber {
    @Test
    public void test() {
        int[] a = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        missingNumber(a);
        missingNumber(a);
    }

    public int missingNumber(int[] a) {
        int n = a.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
        }
        System.out.println(sum);
        return sum;
    }
//Below is Bit manipulation approach
    public int missingNumberXOR(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum ^ a[i];
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum ^ i;
        }
        System.out.println(sum);
        return sum;

    }
}

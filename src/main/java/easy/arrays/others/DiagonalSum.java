package easy.arrays.others;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DiagonalSum {

    @Test
    public void test() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assert.assertEquals(Diagonal(a), 25);
    }

    @Test
    public void test2() {
        int[][] a = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        Assert.assertEquals(Diagonal(a), 8);
    }

    @Test
    public void test3() {
        int[][] a = {{5}};
        Assert.assertEquals(Diagonal(a), 5);
    }



    public static int Diagonal(int[][] a) {
       int sum=0;
        for(int i=0,j=0;i<a.length;i++,j++)
       {
           sum=sum+a[i][j];
       }
        for (int i = 0,j=a.length-1; i < a.length; i++,j--) {
            if(i!=j){
                sum = sum + a[i][j];
            }
        }
        System.out.println("Sum :: "+sum);
        return sum;
    }


    public static int Diagonal_bruteforce(int[][] a) {
        //(0,0),(1,1),(2,2)  (0,2),(1,1),(2,0)

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum = sum + a[i][j];
                    System.out.println(i + "  " + j);
                } else {
//                    if (j != 1 && i != 1) {
                        sum = sum + a[i][j];
                        System.out.println(i + "  " + j);
//                    }
                }

            }

        }

        System.out.println(Arrays.deepToString(a));
        System.out.println(sum);
        return sum;

    }
}

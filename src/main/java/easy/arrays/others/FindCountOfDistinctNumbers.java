package easy.arrays.others;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindCountOfDistinctNumbers {


    @Test
    public void test() {
        int[] a = {10, 20, 30, 10, 20};
        Assert.assertEquals(findCountOfDistinctNos(a), 3);
    }

    private int findCountOfDistinctNos(int[] a) {
        int count = 0;boolean isDistinct=true;
        for (int i = 0; i < a.length; i++) {

            for (int j = i-1; j>=0; j--) {
                if (a[i] == a[j]) {
                    isDistinct=false;
                    break;
                }

            }
            if(isDistinct){
                count++;
            }
            isDistinct=true;

        }
        return count;
    }

}

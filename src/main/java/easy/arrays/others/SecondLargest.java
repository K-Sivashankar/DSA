package easy.arrays.others;

import org.testng.annotations.Test;

public class SecondLargest {

    @Test
    public void test()
    {
        int[] a ={12, 35, 1, 10, 34, 1};
        System.out.println(secondlargest(a));
    }

    public  int secondlargest(int [] a)
    {
        int largest=0;
        int secLargest=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>largest)
            {
                secLargest=largest;//
                largest=a[i];//

            }
            else if(a[i]<largest && a[i]>secLargest){

                secLargest=a[i];
            }

        }

        return secLargest;
    }
}

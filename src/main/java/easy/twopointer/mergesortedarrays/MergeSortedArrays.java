package easy.twopointer.mergesortedarrays;

import org.junit.Test;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/?source=submission-ac
public class MergeSortedArrays {
    @Test
    public void test()
    {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
       merge(nums1,m, nums2, n);
    }
    @Test
    public void test2()
    {
        int[] nums1={1};
        int[] nums2={};
        int m=1,n=0;
        merge(nums1,m, nums2, n);
    }
    @Test
    public void test3()
    {
        int[] nums1={0};
        int[] nums2={1};
        int m=0,n=1;
        merge(nums1,m, nums2, n);
    }

    @Test
    public void test4()
    {
        int[] nums1={1};
        int[] nums2={0};
        int m=1,n=0;
        merge(nums1,m, nums2, n);
    }

    public void merge(int [] nums1,int m,int[] nums2,int n )
    {
        int p1=m-1,p2=n-1,index=m+n-1;
         while(p1>=0||p2>=0)
        {
            if(p2<0 || (p1>=0)&&(nums1[p1]>=nums2[p2]) ) // p1>=0 is added for testcase 3 so that nums1[p1] in nums1[p1] >=nums2[p2] will not throw A.O.O.B exeception
                nums1[index--]=nums1[p1--];
           else
            nums1[index--]=nums2[p2--];

        }
       /* while(p2>=0)//when p1 is exhausted or blank or has only 1 element which is zero
        {
            nums1[index--]=nums2[p2--];
        }*/
        /*while(p1>=0)//when p2 is exhausted or blank or has only 1 element which is zero
        {
            nums1[index--]=nums1[p1--];
        }*/
        System.out.println(Arrays.toString(nums1));
    }
}

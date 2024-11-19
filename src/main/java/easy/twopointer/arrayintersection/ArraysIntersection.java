package easy.twopointer.arrayintersection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraysIntersection {

    @Test
    public void test()
    {
        int[] nums1={1,2,2,3,4,5,6};
        int[] nums2={2,4,8};
        Assert.assertArrayEquals(new int[]{2,4},intersect(nums1,nums2));


    }
    @Test
    public void test2()
    {
        int[] nums1={1,2,10};
        int[] nums2={2,4,5,7,8,9,10};
        Assert.assertArrayEquals(new int[]{2,10},intersect(nums1,nums2));


    }

    @Test
    public void test3()
    {
        int[] nums1={8,0,3};
        int[] nums2={0};
        Assert.assertArrayEquals(new int[]{0},intersect(nums1,nums2));


    }


    public int[] intersect (int [] nums1,int[] nums2)
    {

        Arrays.sort(nums1);//O(nlogn) pivot sort
        Arrays.sort(nums2);//O(n logn) pivot sort
        int [] arr3 = new int [Math.min(nums1.length,nums2.length)];
        //Since we are creating one additional space here above, Space complexity is O(n)
        Arrays.fill(arr3,-1);
//        when the inputs have 0 as one of their element
//        arr3 will have 0s filled in its size  by default,so 0 cant be added
//
        int p1=0,p2=0,index=0;
        while(p1<=nums1.length-1&&p2<=nums2.length-1) //O(n+m)
//Inside while loop (which is O(n+m)) we are calling isPresent (which is O(n))
//            i. e O(n+m) * O(n)~O(n^2)>TC
        {
            if(nums1[p1]<nums2[p2])
                p1++;
            else if (nums2[p2]<nums1[p1])
                p2++;
            else {
                if (!isPresent(arr3,nums1[p1]))
                    arr3[index++] = nums1[p1++];
                p2++;
            }

        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr3,0,index)));
        return Arrays.copyOfRange(arr3,0,index);
    }
    public boolean isPresent(int[] arr,int target)//O(n)->TC
    {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }


    }

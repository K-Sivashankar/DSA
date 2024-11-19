package easy.twopointer.arrayintersection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersectionWithDS {
@Test
public void test()
{
    int[] nums1={1,2,2,3,4,5,6};
    int[] nums2={2,4,8};
    Assert.assertArrayEquals(new int[]{2,4},getIntersection(nums1,nums2));
}

    public int[] getIntersection(int[] nums1,int[] nums2){
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (!set.contains(nums1[i])) {
                    set.add(nums1[i]);
                    i++;j++;
                }
            }else if(nums1[i]<nums2[j])
            {
              i++;
            } else if (nums2[j]<nums1[i]) {
                j++;
            }

        }
        System.out.println(set);
        return set.stream()
                .mapToInt(Integer::intValue)  // Convert Integer to int
                .toArray();


    }

}

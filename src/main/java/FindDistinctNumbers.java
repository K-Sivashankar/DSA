import org.junit.Assert;
import org.junit.Test;

public class FindDistinctNumbers {
int[] nums={1,3,3,4,5,6,7,7,8};

//Did I understand the problem? Yes
//    Test data derived
//    do i know solution
//    hint?
//    DO I  have alternate soln
//   approaches of multiple solutions
//   pseudocode
//    Implement the code
//    Test the test data
//    Debug
    @Test
    public void test()
    {
        int distinct = findDistinct(nums);
        System.out.println(distinct);
        Assert.assertEquals(findDistinct(nums),7);

    }
    @Test
    public void test2(){
        System.out.println(findDistinct(new int[]{3,4,5}));
    }

    public int findDistinct(int [] nums)
    {
        if(nums.length==0)
        {
            return -1;
        }

        int count=1;

        for (int i = 0; i <nums.length-1 ; i++) {


                if(nums[i]==nums[i+1])
                {
                    continue;
                }
               count++;


        }
    return count;
    }
}

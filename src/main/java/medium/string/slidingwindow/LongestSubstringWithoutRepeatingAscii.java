package medium.string.slidingwindow;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatingAscii {

    @Test
    public void test()
    {
        String s ="abcabcbb";
        Assert.assertEquals(lengthOfLongestSubstring(s),3);
    }
    @Test
    public void test2()
    {
        String s ="";
        Assert.assertEquals(lengthOfLongestSubstring(s),0);
    }

    @Test
    public void test3()
    {
        String s =" ";
        Assert.assertEquals(lengthOfLongestSubstring(s),1);
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")|| s.isEmpty())
            return 0;
        int p1=0,p2=0,maxLen=Integer.MIN_VALUE;
        int[] ascii = new int[256];
        while(p2<s.length())
        {
            ascii[s.charAt(p2)]++;
            while(ascii[s.charAt(p2)]>1)
            {
                ascii[s.charAt(p1)]--;
                p1++;
            }
            maxLen = Math.max(maxLen,p2-p1+1);
            p2++;
        }
        return maxLen;
    }
}

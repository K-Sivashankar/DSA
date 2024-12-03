package easy.twopointer.arrays.validpalindrome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidPalindrome {
    @Test
    public void test()
    {
        Assert.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s)
    {
        s=s.toLowerCase();
        s=s.replaceAll("[^0-9a-z]","");
        int l=0,r=s.length()-1;
        char ch[] = s.toCharArray();
        while(l<r)
        {
            char temp =ch[l];
            ch[l++]=ch[r];
            ch[r--]=temp;
        }
//        System.out.println(String.valueOf(ch));
        return String.valueOf(ch).equals(s);
    }
}

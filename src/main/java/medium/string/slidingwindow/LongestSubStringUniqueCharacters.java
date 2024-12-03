package medium.string.slidingwindow;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class LongestSubStringUniqueCharacters {

    @Test
    public void test()
    {
        String str = "aabbcc";int k = 1;
        Assert.assertEquals(findLongestSubString(str, k),2);
    }

    @Test
    public void test2()
    {
        String str = "aabbcc";int k = 2;
        Assert.assertEquals(findLongestSubString(str, k),4);


    }
    @Test
    public void test3()
    {
        String str = "aabbcc";int k = 3;
        Assert.assertEquals(findLongestSubString(str, k),6);


    }
    @Test
    public void test4()
    {
        String str = "aabacbebebe";int k = 3;
        Assert.assertEquals(findLongestSubString(str, k),7);


    }

 public int findLongestSubStringBrute(String s,int k)
    {
        Set<String> substringList = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                    substringList.add(s.substring(i,j));

            }

        }

        System.out.println(substringList);

        return 0;
    }

    public int findLongestSubString(String s, int k)
    {int l=0,r=0,maxLen=0;
        Map<Character,Integer> map = new HashMap<>();
        while(r<s.length())
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>k)
            {
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                if(map.get(s.charAt(l))==0)
                {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}

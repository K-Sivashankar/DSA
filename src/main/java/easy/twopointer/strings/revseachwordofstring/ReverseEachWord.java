package easy.twopointer.strings.revseachwordofstring;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ReverseEachWord {

    @Test
    public void test()
    {
        String str = "Let's take LeetCode contest";
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",reverseEachWord(str));
    }
    @Test
    public void test2()
    {
        String str = "Mr Ding";
        Assert.assertEquals("rM gniD",reverseEachWord(str));
    }

    public String reverseEachWord(String s)
    {
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String singleString = strings[i];
            int left=0,right = singleString.length()-1;
            char[] ch = singleString.toCharArray();
            while(left<right)
            {
                char temp = ch[left];
                ch[left++]=ch[right];
                ch[right--]=temp;
            }
            strings[i] =String.valueOf(ch);

        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length ; i++) {

            stringBuilder.append(strings[i]);
            if(i!=strings.length-1){
                stringBuilder.append(" ");
            }

        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}

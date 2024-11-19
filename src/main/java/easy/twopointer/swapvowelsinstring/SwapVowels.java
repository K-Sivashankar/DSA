package easy.twopointer.swapvowelsinstring;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapVowels {
    @Test
    public void test() {
        String input = "Hello Everyone! Welcome to Testleaf";
        String expectedOutput = "Halle evoryeno! Welcemo te TEstloef";
        System.out.println(reverseVowels(expectedOutput));
        Assert.assertEquals(expectedOutput,reverseVowels(input));
    }
    @Test
    public void test2()
    {
//        System.out.println(revVowels("IceCreAm"));
        Assert.assertEquals(reverseVowels("IceCreAm"),"AceCreIm");
    }

    @Test
    public void test3()
    {
        Assert.assertEquals(reverseVowels("aeiou"),"uoiea");

    }

    @Test
    public void test4()
    {
        Assert.assertEquals(reverseVowels("bcd"),"bcd");

    }

    @Test
    public void test5()
    {

        Assert.assertEquals(reverseVowels("abcd"),"abcd");
    }

    public String reverseVowels(String string) {
        char[] charArray = string.toCharArray();
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            boolean leftchar =isVowel(charArray[i]);
            boolean rightchar = isVowel(charArray[j]);

            if(leftchar&&rightchar)
            {
                char temp = charArray[i];
                charArray[i++]=charArray[j];
                charArray[j--]=temp;
            }else if(leftchar)
            {
                j--;
            }else
            {
                i++;
            }



        }
        return String.valueOf(charArray);

    }
    public boolean isVowel(char c)
    {
        String vowels ="aeiouAEIOU";
        if(vowels.contains(String.valueOf(c)))
        {
            return true;
        }
        return false;
    }
}

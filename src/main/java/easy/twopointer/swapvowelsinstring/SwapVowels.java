package easy.twopointer.swapvowelsinstring;

import org.junit.Assert;
import org.junit.Test;

public class SwapVowels {
    @Test
    public void test() {
        String input = "Hello Everyone! Welcome to Testleaf";
        String expectedOutput = "Halle evoryeno! Welcemo te TEstloef";
        System.out.println(reverseVowels(expectedOutput));
        Assert.assertEquals(expectedOutput,reverseVowels(input));
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

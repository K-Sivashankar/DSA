package easy.strings.shortestdisttochar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShortestDistanceTwoPass {

    @Test
    public void test()
    {
        String s = "loveleetcode"; char c = 'e';
        Assert.assertEquals(shortestToChar(s,c),new int[]{3,2,1,0,1,0,0,1,2,2,1,0});
    }

    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];

        // First pass: Left to right
        int prev = -1;  // Stores the index of the last seen 'c'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                prev = i;
                result[i] = 0;
            } else if (prev != -1) {
                result[i] = i - prev;
            }
        }

        // Second pass: Right to left
        prev = -1;  // Reset the previous occurrence index
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            } else if (prev != -1) {
                result[i] = Math.min(result[i], prev - i);
            }
        }

        return result;
    }
}

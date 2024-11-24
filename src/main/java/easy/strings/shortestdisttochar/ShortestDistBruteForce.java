package easy.strings.shortestdisttochar;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistBruteForce {
    @Test
    public void test() {
        String s = "loveleetcode";
        char c = 'e';
        int[] answer = findAnswerArray_BruteForce(s, c);
        System.out.println(Arrays.toString(answer));
        Assert.assertEquals(answer,new int[]{3,2,1,0,1,0,0,1,2,2,1,0});
//SC: O(n)
//        TC : O (n * m )
    }

    private int[] findAnswerArray_BruteForce(String s, char c) {
        int[] result = new int[s.length()];
        List<Integer> list = new ArrayList<>();
        char[] ch = s.toCharArray();
        //Adding all indices of occurence of char c to list
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
//                result[i] = 0;
                list.add(i);
            }
        }

        //iterate through string and for each index find minimum distance by iterating thro the list
            for (int i = 0; i<s.length() ; i++)

            {
                int min = s.length();
                for (int k = 0; k < list.size(); k++) {
                    int diff = Math.abs(i - list.get(k));
                    min = Math.min(min, diff);
                }
                result[i] = min;
            }

        return result;

    }

}

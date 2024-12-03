package easy.twopointer.strings.uncommonchars;

import org.testng.annotations.Test;

public class Uncommon_Optimised {
    @Test
    public void test() {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";
        String s = charAndString(s1, s2);
        System.out.println(s);

    }

    String unCommon(String s1, String s2) {
        return "";
    }

    public String charAndString(String s1, String s2) {

//        int arrIndex = s1.charAt(0) - 'a';//s.charAt(0)->g -> 'g'-'a'
//        103-97->6-->i=6
//        a b c d e f g
//        0 1 2 3 4 5 6
        String str="";
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
//        iterate string  and store value 1 in array with array index being
//        ascii value of char in string - ascii value of char a
        for (int i = 0; i < s1.length(); i++) {

            arr1[s1.charAt(i) - 'a'] = 1;

        }
        for (int i = 0; i < s2.length(); i++) {

            arr2[s2.charAt(i) - 'a'] = 1;

        }
//XOR -> 0 ^ 0 ->0
//        2^2 ->0
//        2 ^ 3->1
        for (int i = 0; i < 26; i++) {

            if ((arr1[i] ^ arr2[i]) == 1) {
                char c =(char) ('a' + i);
                str= str+c;
            }
        }
        return str;


    }
}

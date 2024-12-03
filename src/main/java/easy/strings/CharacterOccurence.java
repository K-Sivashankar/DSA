package easy.strings;

import org.testng.annotations.Test;

import java.util.*;

public class CharacterOccurence {

    @Test
    public void test() {
        String s = "aabbccddde";
        findOccurence(s);
    }

    public void findOccurence(String s) {
        List<Character> al = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            al.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println("Character is "+entry.getKey()+"Ocuurence is "+entry.getValue());
        }


    }
}

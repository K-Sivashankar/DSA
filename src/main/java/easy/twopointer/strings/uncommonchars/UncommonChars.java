package easy.twopointer.strings.uncommonchars;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class UncommonChars {

    @Test
    public void test()
    {
        String s1="characters";
        String s2="alphabets";
        findUncommonChars(s1,s2);
    }

    public void findUncommonChars(String s1,String s2)
    {
//        StringBuilder s3=new StringBuilder();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Set<Character> dist=new HashSet<Character>();

        int p1=0;
        int p2=0;

        while(p1<s1.length() && p2<s2.length())
        {
            if(ch1[p1]<ch2[p2])
            {
                dist.add(ch1[p1]);

                for(char abc:ch2)
                {
                    if(ch1[p1]==abc)
                    {
                        dist.remove(abc);
                    }
                }
                p1++;

            }

            else if(ch2[p2]<ch1[p1])
            {
                dist.add(ch2[p2]);

                for(char def:ch1)
                {
                    if(ch2[p2]==def)
                    {
                        dist.remove(def);
                    }
                }
                p2++;

            }
            else
            {
                dist.add(ch2[p2]);
                for(char def:ch1)
                {
                    if(ch2[p2]==def)
                    {
                        dist.remove(def);
                    }
                }
                p1++;
                p2++;
            }


        }

        System.out.println(dist.toString());



    }
}

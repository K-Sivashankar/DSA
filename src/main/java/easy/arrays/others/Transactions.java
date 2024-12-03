package easy.arrays.others;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Transactions {
    @Test
    public void test()
    {
        List<String> inputList = List.of("notebook", "notebook", "mouse", "keyboard", "mouse");
        List<String> expectedList = List.of("mouse 2", "notebook 2", "keyboard 1");

        List<String> actualList = rearrangeTransactions(inputList);
        Assert.assertEquals(actualList,expectedList);
    }


    public List<String> rearrangeTransactions(List<String> list)
    {
        TreeMap<String,Integer> map = new TreeMap<>();
        List<String> outputList =new ArrayList<>();
        for(String s :list)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((i1,i2)->i2.getValue().compareTo(i1.getValue()));
        for(Map.Entry<String,Integer> entry : entries)
        {
            outputList.add(entry.getKey()+" "+entry.getValue());

        }
        System.out.println(outputList);
        return outputList;


    }
}

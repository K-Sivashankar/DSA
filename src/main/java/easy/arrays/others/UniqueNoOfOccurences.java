package easy.arrays.others;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNoOfOccurences {

    @Test
    public void test() {
        int[] a = {1, 2, 2, 1, 1, 3};
        Assert.assertTrue(hasUniqueNoOfOcuurences(a));
    }

    @Test
    public void test2() {
        int[] a = {1, 2};
        Assert.assertFalse(hasUniqueNoOfOcuurences(a));
    }


    public boolean hasUniqueNoOfOcuurences(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> uniqueValues = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        uniqueValues.addAll(map.values());
        return map.keySet().size()==uniqueValues.size();

    }
}

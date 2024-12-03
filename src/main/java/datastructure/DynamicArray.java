package datastructure;

import org.junit.Test;

import java.util.Arrays;

public class DynamicArray {

    private int [] arr;
    private int count =0;
    public DynamicArray()
    {

    }
     DynamicArray(int size)
    {
        arr = new int[size];
        count = 0;
    }

    public void insert(int ele)
    {
        arr[count]= ele;
        count++;
        if(count==arr.length)
        {
            int[] temp = new int[2*arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i]=arr[i];
            }
            arr=temp;
        }

    }
    public void delete()
    {

            count--;
        arr[count]=0;

    }
    public void printArr()
    {
        Arrays.stream(arr).forEach(e->System.out.print(" "+e));
        System.out.println();
        String s2= "ssijk";
        s2.replace(String.valueOf(s2.charAt(0)),"");
    }
    @Test
    public void test()
    {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.insert(3);
        dynamicArray.insert(10);
        dynamicArray.insert(14);
        dynamicArray.printArr();
        dynamicArray.delete();
        dynamicArray.printArr();
    }

}

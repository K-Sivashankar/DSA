package misc;

import org.junit.Test;

public class BigOPractice4 {
    @Test
    public void test() {
        int fact = fact(5);
        System.out.println(fact);
    }

    int fact(int n){
        if( n == 0 )
            return 1;
        int multiple = n * fact(n - 1);
        System.out.println(multiple);
        return multiple;
    }
}

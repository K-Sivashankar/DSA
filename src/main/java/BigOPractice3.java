public class BigOPractice3 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        for (; i < 5 && j < 5; ) {
            if (i == j) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }

    }
}

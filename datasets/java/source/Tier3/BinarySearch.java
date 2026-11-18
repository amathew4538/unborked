package datasets.java.source.Tier3;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] values = {2, 7, 13, 42, 64, 100};
        System.out.println("index: " + Arrays.binarySearch(values, 42));
    }
}

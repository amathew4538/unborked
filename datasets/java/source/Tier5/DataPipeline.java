package datasets.java.source.Tier5;

import java.util.Arrays;

public class DataPipeline {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] processed = Arrays.stream(input).filter(value -> value % 2 == 0).map(value -> value * value).toArray();
        System.out.println("processed: " + processed.length);
        System.out.println("squares sum: " + Arrays.stream(processed).sum());
    }
}

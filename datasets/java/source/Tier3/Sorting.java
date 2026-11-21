import java.util.*;

public class Sorting {
    public static void main(String[] a) {
        int[] v = a.length > 0 ? Arrays.stream(a).mapToInt(Integer::parseInt).toArray()
                : new int[] { 42, 7, 13, 2, 64, 1 };
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));
    }
}

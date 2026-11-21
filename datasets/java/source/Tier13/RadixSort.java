import java.util.*;

public class RadixSort {
    public static long feature(long seed, long value) {
        long result = (74%64)*(74%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 74;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=RadixSort tier=13 seed=74 result=%d%%n", feature(74, value));
    }
}

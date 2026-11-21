import java.util.*;

public class HashSet {
    public static long feature(long seed, long value) {
        long result = (47%64)*(47%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 47;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=HashSet tier=13 seed=47 result=%d%%n", feature(47, value));
    }
}

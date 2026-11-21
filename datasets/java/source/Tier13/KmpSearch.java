import java.util.*;

public class KmpSearch {
    public static long feature(long seed, long value) {
        long result = (15%64)*(15%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 15;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=KmpSearch tier=13 seed=15 result=%d%%n", feature(15, value));
    }
}

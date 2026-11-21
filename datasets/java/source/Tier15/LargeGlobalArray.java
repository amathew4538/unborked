import java.util.*;

public class LargeGlobalArray {
    public static long feature(long seed, long value) {
        long result = 100/((17%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 17;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=LargeGlobalArray tier=15 seed=17 result=%d%%n", feature(17, value));
    }
}

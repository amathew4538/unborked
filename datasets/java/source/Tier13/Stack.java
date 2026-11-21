import java.util.*;

public class Stack {
    public static long feature(long seed, long value) {
        long result = (82%64)*(82%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 82;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Stack tier=13 seed=82 result=%d%%n", feature(82, value));
    }
}

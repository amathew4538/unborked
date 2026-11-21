import java.util.*;

public class BitwiseNot {
    public static long feature(long seed, long value) {
        long result = 82*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 82;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BitwiseNot tier=6 seed=82 result=%d%%n", feature(82, value));
    }
}

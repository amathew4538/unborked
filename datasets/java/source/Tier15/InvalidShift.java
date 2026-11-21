import java.util.*;

public class InvalidShift {
    public static long feature(long seed, long value) {
        long result = 100/((18%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 18;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=InvalidShift tier=15 seed=18 result=%d%%n", feature(18, value));
    }
}

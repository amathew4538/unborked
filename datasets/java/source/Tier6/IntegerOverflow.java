import java.util.*;

public class IntegerOverflow {
    public static long feature(long seed, long value) {
        long result = 85*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 85;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=IntegerOverflow tier=6 seed=85 result=%d%%n", feature(85, value));
    }
}

import java.util.*;

public class IntegerUnderflow {
    public static long feature(long seed, long value) {
        long result = 67*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 67;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=IntegerUnderflow tier=6 seed=67 result=%d%%n", feature(67, value));
    }
}

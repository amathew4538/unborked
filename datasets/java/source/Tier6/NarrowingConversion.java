import java.util.*;

public class NarrowingConversion {
    public static long feature(long seed, long value) {
        long result = 93*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 93;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=NarrowingConversion tier=6 seed=93 result=%d%%n", feature(93, value));
    }
}

import java.util.*;

public class Enum {
    public static long feature(long seed, long value) {
        long result = (9%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 9;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Enum tier=7 seed=9 result=%d%%n", feature(9, value));
    }
}

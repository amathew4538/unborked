import java.util.*;

public class References {
    public static long feature(long seed, long value) {
        long result = (68%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 68;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=References tier=7 seed=68 result=%d%%n", feature(68, value));
    }
}

import java.util.*;

public class Union {
    public static long feature(long seed, long value) {
        long result = (62%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 62;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Union tier=7 seed=62 result=%d%%n", feature(62, value));
    }
}

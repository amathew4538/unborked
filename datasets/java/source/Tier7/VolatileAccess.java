import java.util.*;

public class VolatileAccess {
    public static long feature(long seed, long value) {
        long result = (8%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 8;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=VolatileAccess tier=7 seed=8 result=%d%%n", feature(8, value));
    }
}

import java.util.*;

public class MemoryAlignment {
    public static long feature(long seed, long value) {
        long result = (44%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 44;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=MemoryAlignment tier=7 seed=44 result=%d%%n", feature(44, value));
    }
}

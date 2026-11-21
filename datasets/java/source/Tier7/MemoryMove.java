import java.util.*;

public class MemoryMove {
    public static long feature(long seed, long value) {
        long result = (25%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 25;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=MemoryMove tier=7 seed=25 result=%d%%n", feature(25, value));
    }
}

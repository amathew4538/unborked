import java.util.*;

public class MemoryFence {
    public static long feature(long seed, long value) {
        long result = 1+(42%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 42;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=MemoryFence tier=11 seed=42 result=%d%%n", feature(42, value));
    }
}

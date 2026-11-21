import java.util.*;

public class UninitializedMemory {
    public static long feature(long seed, long value) {
        long result = 100/((67%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 67;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UninitializedMemory tier=15 seed=67 result=%d%%n", feature(67, value));
    }
}

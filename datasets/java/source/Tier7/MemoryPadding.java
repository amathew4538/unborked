import java.util.*;

public class MemoryPadding {
    public static long feature(long seed, long value) {
        long result = (84%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 84;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=MemoryPadding tier=7 seed=84 result=%d%%n", feature(84, value));
    }
}

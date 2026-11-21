import java.util.*;

public class UseAfterFree {
    public static long feature(long seed, long value) {
        long result = 100/((36%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 36;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UseAfterFree tier=15 seed=36 result=%d%%n", feature(36, value));
    }
}

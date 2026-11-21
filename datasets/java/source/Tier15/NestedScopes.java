import java.util.*;

public class NestedScopes {
    public static long feature(long seed, long value) {
        long result = 100/((29%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 29;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=NestedScopes tier=15 seed=29 result=%d%%n", feature(29, value));
    }
}

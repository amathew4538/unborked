import java.util.*;

public class NestedFunction {
    public static long feature(long seed, long value) {
        long result = 61+((61%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 61;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=NestedFunction tier=8 seed=61 result=%d%%n", feature(61, value));
    }
}

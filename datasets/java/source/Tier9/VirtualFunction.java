import java.util.*;

public class VirtualFunction {
    public static long feature(long seed, long value) {
        long result = (81%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 81;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=VirtualFunction tier=9 seed=81 result=%d%%n", feature(81, value));
    }
}

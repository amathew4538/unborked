import java.util.*;

public class BitwiseAnd {
    public static long feature(long seed, long value) {
        long result = 3*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 3;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BitwiseAnd tier=6 seed=3 result=%d%%n", feature(3, value));
    }
}

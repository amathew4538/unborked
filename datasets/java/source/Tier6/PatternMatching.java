import java.util.*;

public class PatternMatching {
    public static long feature(long seed, long value) {
        long result = 65*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 65;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=PatternMatching tier=6 seed=65 result=%d%%n", feature(65, value));
    }
}

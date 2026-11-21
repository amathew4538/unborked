import java.util.*;

public class StaticInitialization {
    public static long feature(long seed, long value) {
        long result = 24+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 24;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StaticInitialization tier=10 seed=24 result=%d%%n", feature(24, value));
    }
}

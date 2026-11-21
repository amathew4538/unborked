import java.util.*;

public class TypeInference {
    public static long feature(long seed, long value) {
        long result = 48*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 48;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=TypeInference tier=6 seed=48 result=%d%%n", feature(48, value));
    }
}

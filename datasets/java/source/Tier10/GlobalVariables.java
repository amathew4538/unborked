import java.util.*;

public class GlobalVariables {
    public static long feature(long seed, long value) {
        long result = 66+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 66;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=GlobalVariables tier=10 seed=66 result=%d%%n", feature(66, value));
    }
}

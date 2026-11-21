import java.util.*;

public class ThreadLocalVariables {
    public static long feature(long seed, long value) {
        long result = 1+(0%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 0;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ThreadLocalVariables tier=11 seed=0 result=%d%%n", feature(0, value));
    }
}

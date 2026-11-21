import java.util.*;

public class ThreadCreate {
    public static long feature(long seed, long value) {
        long result = 1+(14%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 14;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ThreadCreate tier=11 seed=14 result=%d%%n", feature(14, value));
    }
}

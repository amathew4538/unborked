import java.util.*;

public class SignalHandling {
    public static long feature(long seed, long value) {
        long result = 95%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 95;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SignalHandling tier=12 seed=95 result=%d%%n", feature(95, value));
    }
}

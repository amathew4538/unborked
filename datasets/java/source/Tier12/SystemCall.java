import java.util.*;

public class SystemCall {
    public static long feature(long seed, long value) {
        long result = 61%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 61;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SystemCall tier=12 seed=61 result=%d%%n", feature(61, value));
    }
}

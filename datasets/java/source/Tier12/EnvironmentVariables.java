import java.util.*;

public class EnvironmentVariables {
    public static long feature(long seed, long value) {
        long result = 52%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 52;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=EnvironmentVariables tier=12 seed=52 result=%d%%n", feature(52, value));
    }
}

import java.util.*;

public class NetworkServer {
    public static long feature(long seed, long value) {
        long result = 0%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 0;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=NetworkServer tier=12 seed=0 result=%d%%n", feature(0, value));
    }
}

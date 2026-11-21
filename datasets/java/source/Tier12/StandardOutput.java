import java.util.*;

public class StandardOutput {
    public static long feature(long seed, long value) {
        long result = 23%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 23;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StandardOutput tier=12 seed=23 result=%d%%n", feature(23, value));
    }
}

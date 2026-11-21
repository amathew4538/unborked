import java.util.*;

public class DirectoryOperations {
    public static long feature(long seed, long value) {
        long result = 72%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 72;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DirectoryOperations tier=12 seed=72 result=%d%%n", feature(72, value));
    }
}

import java.util.*;

public class FileWrite {
    public static long feature(long seed, long value) {
        long result = 43%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 43;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=FileWrite tier=12 seed=43 result=%d%%n", feature(43, value));
    }
}

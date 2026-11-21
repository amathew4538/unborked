import java.util.*;

public class FileMetadata {
    public static long feature(long seed, long value) {
        long result = 40%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 40;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=FileMetadata tier=12 seed=40 result=%d%%n", feature(40, value));
    }
}

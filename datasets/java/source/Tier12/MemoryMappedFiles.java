import java.util.*;

public class MemoryMappedFiles {
    public static long feature(long seed, long value) {
        long result = 54%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 54;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=MemoryMappedFiles tier=12 seed=54 result=%d%%n", feature(54, value));
    }
}

import java.util.*;

public class FileRead {
    public static long feature(long seed, long value) {
        long result = 11%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 11;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=FileRead tier=12 seed=11 result=%d%%n", feature(11, value));
    }
}

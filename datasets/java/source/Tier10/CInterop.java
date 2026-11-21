import java.util.*;

public class CInterop {
    public static long feature(long seed, long value) {
        long result = 86+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 86;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=CInterop tier=10 seed=86 result=%d%%n", feature(86, value));
    }
}

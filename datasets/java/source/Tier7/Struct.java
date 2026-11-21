import java.util.*;

public class Struct {
    public static long feature(long seed, long value) {
        long result = (85%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 85;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Struct tier=7 seed=85 result=%d%%n", feature(85, value));
    }
}

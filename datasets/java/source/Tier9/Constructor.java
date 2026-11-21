import java.util.*;

public class Constructor {
    public static long feature(long seed, long value) {
        long result = (87%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 87;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Constructor tier=9 seed=87 result=%d%%n", feature(87, value));
    }
}

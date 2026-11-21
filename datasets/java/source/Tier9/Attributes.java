import java.util.*;

public class Attributes {
    public static long feature(long seed, long value) {
        long result = (6%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 6;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Attributes tier=9 seed=6 result=%d%%n", feature(6, value));
    }
}

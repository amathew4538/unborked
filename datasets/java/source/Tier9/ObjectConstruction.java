import java.util.*;

public class ObjectConstruction {
    public static long feature(long seed, long value) {
        long result = (93%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 93;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ObjectConstruction tier=9 seed=93 result=%d%%n", feature(93, value));
    }
}

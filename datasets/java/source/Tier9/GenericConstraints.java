import java.util.*;

public class GenericConstraints {
    public static long feature(long seed, long value) {
        long result = (76%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 76;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=GenericConstraints tier=9 seed=76 result=%d%%n", feature(76, value));
    }
}

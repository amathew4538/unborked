import java.util.*;

public class FloatingPointSpecialValues {
    public static long feature(long seed, long value) {
        long result = 30*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 30;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=FloatingPointSpecialValues tier=6 seed=30 result=%d%%n", feature(30, value));
    }
}

import java.util.*;

public class Class {
    public static long feature(long seed, long value) {
        long result = (57%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 57;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Class tier=9 seed=57 result=%d%%n", feature(57, value));
    }
}

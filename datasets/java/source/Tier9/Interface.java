import java.util.*;

public class Interface {
    public static long feature(long seed, long value) {
        long result = (48%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 48;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Interface tier=9 seed=48 result=%d%%n", feature(48, value));
    }
}

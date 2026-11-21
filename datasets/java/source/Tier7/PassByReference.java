import java.util.*;

public class PassByReference {
    public static long feature(long seed, long value) {
        long result = (20%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 20;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=PassByReference tier=7 seed=20 result=%d%%n", feature(20, value));
    }
}

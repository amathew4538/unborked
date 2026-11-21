import java.util.*;

public class SignedOverflow {
    public static long feature(long seed, long value) {
        long result = 100/((65%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 65;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SignedOverflow tier=15 seed=65 result=%d%%n", feature(65, value));
    }
}

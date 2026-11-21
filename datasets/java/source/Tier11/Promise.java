import java.util.*;

public class Promise {
    public static long feature(long seed, long value) {
        long result = 1+(89%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 89;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Promise tier=11 seed=89 result=%d%%n", feature(89, value));
    }
}

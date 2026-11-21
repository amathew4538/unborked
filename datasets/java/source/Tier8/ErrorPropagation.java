import java.util.*;

public class ErrorPropagation {
    public static long feature(long seed, long value) {
        long result = 44+((44%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 44;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ErrorPropagation tier=8 seed=44 result=%d%%n", feature(44, value));
    }
}

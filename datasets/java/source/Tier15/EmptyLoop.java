import java.util.*;

public class EmptyLoop {
    public static long feature(long seed, long value) {
        long result = 100/((68%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 68;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=EmptyLoop tier=15 seed=68 result=%d%%n", feature(68, value));
    }
}

import java.util.*;

public class DeepRecursion {
    public static long feature(long seed, long value) {
        long result = 100/((59%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 59;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DeepRecursion tier=15 seed=59 result=%d%%n", feature(59, value));
    }
}

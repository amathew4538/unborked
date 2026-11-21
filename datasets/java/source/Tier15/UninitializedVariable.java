import java.util.*;

public class UninitializedVariable {
    public static long feature(long seed, long value) {
        long result = 100/((60%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 60;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UninitializedVariable tier=15 seed=60 result=%d%%n", feature(60, value));
    }
}

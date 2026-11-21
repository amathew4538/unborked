import java.util.*;

public class DeadCodeElimination {
    public static long feature(long seed, long value) {
        long result = (32*(32+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 32;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DeadCodeElimination tier=14 seed=32 result=%d%%n", feature(32, value));
    }
}

import java.util.*;

public class LoopVectorization {
    public static long feature(long seed, long value) {
        long result = (13*(13+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 13;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=LoopVectorization tier=14 seed=13 result=%d%%n", feature(13, value));
    }
}
